package cn.zmlio.microcms.service

import cn.zmlio.microcms.entity.UserEntity

interface UserService {

    fun createUser(user: UserEntity)

}