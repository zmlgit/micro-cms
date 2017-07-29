package cn.zmlio.microcms.domain

import cn.zmlio.microcms.entity.UserEntity
import cn.zmlio.microcms.values.Access
import cn.zmlio.microcms.values.Role

interface Principal {
    // 当前用户的id
    val id: Long
    // 当前用户的实体对象
    val user: UserEntity

    // 当前用户的角色
    fun roles(): Set<Role>

    // 当前用户的权限
    fun accesses(): Set<Access>
}