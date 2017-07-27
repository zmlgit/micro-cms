package cn.zmlio.microcms.aggregate.impl

import cn.zmlio.microcms.aggregate.Principal
import cn.zmlio.microcms.entity.AccessEntity
import cn.zmlio.microcms.entity.RoleEntity
import cn.zmlio.microcms.entity.UserEntity

class PrincipalImpl(val userEntity: UserEntity) : Principal {

    override val id: Long
        get() = this.user?.id
    override val user: UserEntity
        get() = userEntity

    override fun roles(): Set<RoleEntity> = userEntity?.roles

    override fun accesses(): Set<AccessEntity> = roles()?.flatMap { it.accesses }.toSet()

}