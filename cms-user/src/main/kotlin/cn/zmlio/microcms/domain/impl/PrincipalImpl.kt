package cn.zmlio.microcms.domain.impl

import cn.zmlio.microcms.dao.AccessDao
import cn.zmlio.microcms.dao.RoleDao
import cn.zmlio.microcms.dao.UserDao
import cn.zmlio.microcms.domain.Principal
import cn.zmlio.microcms.entity.UserEntity
import cn.zmlio.microcms.values.Access
import cn.zmlio.microcms.values.Role

class PrincipalImpl(val userEntity: UserEntity, val userDao: UserDao, val roleDao: RoleDao, val accessDao: AccessDao)
    : Principal {

    private val roles: Set<Role> by lazy {
        this.userEntity.roles.map { Role(it.roleCode, it.roleName, it.module, it.isModuleDefault) }.toSet()
    }

    private val accesses: Set<Access> by lazy {
        this.userEntity.roles.flatMap { it.accesses }.toSet().map {
            Access(it.privilege, it.path)
        }.toSet()
    }

    override val id: Long
        get() = this.user.id
    override val user: UserEntity
        get() = userEntity

    override fun roles(): Set<Role> = this.roles

    override fun accesses(): Set<Access> = this.accesses

}




