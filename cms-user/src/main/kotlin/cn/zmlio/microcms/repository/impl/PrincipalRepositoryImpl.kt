package cn.zmlio.microcms.repository.impl

import cn.zmlio.microcms.aggregate.Principal
import cn.zmlio.microcms.aggregate.impl.PrincipalImpl
import cn.zmlio.microcms.dao.AccessDao
import cn.zmlio.microcms.dao.RoleDao
import cn.zmlio.microcms.dao.UserDao
import cn.zmlio.microcms.entity.UserEntity
import cn.zmlio.microcms.repository.PrincipalRepository
import org.springframework.stereotype.Repository

@Repository
open class PrincipalRepositoryImpl(val userDao: UserDao, val roleDao: RoleDao, val accessDao: AccessDao) : PrincipalRepository {

    override fun newPrincipal(): Principal {
        val userEntity = UserEntity()
        return PrincipalImpl(userEntity, userDao, roleDao, accessDao)
    }
}