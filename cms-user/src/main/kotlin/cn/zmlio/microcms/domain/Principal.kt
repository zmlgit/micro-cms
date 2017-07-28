package cn.zmlio.microcms.domain

import cn.zmlio.microcms.entity.AccessEntity
import cn.zmlio.microcms.entity.RoleEntity
import cn.zmlio.microcms.entity.UserEntity

interface Principal {
    // 当前用户的id
    val id: Long
    // 当前用户的实体对象
    val user: UserEntity

    // 当前用户的角色
    fun roles(): Set<RoleEntity>

    // 当前用户的权限
    fun accesses(): Set<AccessEntity>
}