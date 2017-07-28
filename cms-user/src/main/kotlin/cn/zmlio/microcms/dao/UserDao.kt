package cn.zmlio.microcms.dao

import cn.zmlio.microcms.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface UserDao : JpaRepository<UserEntity, Long>