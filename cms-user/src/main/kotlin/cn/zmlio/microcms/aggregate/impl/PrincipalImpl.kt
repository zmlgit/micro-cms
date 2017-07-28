package cn.zmlio.microcms.aggregate.impl

import cn.zmlio.microcms.aggregate.Principal
import cn.zmlio.microcms.dao.AccessDao
import cn.zmlio.microcms.dao.RoleDao
import cn.zmlio.microcms.dao.UserDao
import cn.zmlio.microcms.entity.AccessEntity
import cn.zmlio.microcms.entity.RoleEntity
import cn.zmlio.microcms.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

class PrincipalImpl (val userEntity: UserEntity, val userDao: UserDao, val roleDao: RoleDao, val accessDao: AccessDao)
    : Principal {

    private val roles: Set<RoleEntity> by lazy {
        this.userEntity.roles
    }

    private val accesses: Set<AccessEntity> by lazy {
        this.roles().flatMap { it.accesses }.toSet()
    }

    override val id: Long
        get() = this.user.id
    override val user: UserEntity
        get() = userEntity

    override fun roles(): Set<RoleEntity> = this.roles

    override fun accesses(): Set<AccessEntity> = this.accesses

}




