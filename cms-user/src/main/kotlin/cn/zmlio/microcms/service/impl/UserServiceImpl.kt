package cn.zmlio.microcms.service.impl

import cn.zmlio.microcms.entity.UserEntity
import cn.zmlio.microcms.service.UserService
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val baseRepository: JpaRepository<UserEntity, Long>) : UserService,
        JpaRepository<UserEntity, Long> by baseRepository {
    override fun createUser(user: UserEntity) {
        baseRepository.save(user)
    }

}