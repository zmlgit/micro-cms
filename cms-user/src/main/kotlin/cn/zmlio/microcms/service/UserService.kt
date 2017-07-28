package cn.zmlio.microcms.service

import cn.zmlio.microcms.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserService {

    fun createUser(user: UserEntity)

}