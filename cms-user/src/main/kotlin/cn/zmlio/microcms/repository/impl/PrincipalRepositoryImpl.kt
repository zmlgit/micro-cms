package cn.zmlio.microcms.repository.impl

import cn.zmlio.microcms.domain.Principal
import cn.zmlio.microcms.domain.impl.PrincipalImpl
import cn.zmlio.microcms.dao.AccessDao
import cn.zmlio.microcms.dao.RoleDao
import cn.zmlio.microcms.dao.UserDao
import cn.zmlio.microcms.entity.UserEntity
import cn.zmlio.microcms.repository.PrincipalRepository
import org.springframework.stereotype.Repository

@Repository class PrincipalRepositoryImpl(val userDao: UserDao, val roleDao: RoleDao, val accessDao: AccessDao) : PrincipalRepository {

    internal fun fillPrincipal(userEntity: UserEntity): PrincipalImpl {
        return PrincipalImpl(userEntity, userDao, roleDao, accessDao)
    }

    override fun findPrincipalByUsername(username: String): Principal {
        return userDao.findByUsername(username)?.let {
            fillPrincipal(it)
        }!!
    }

    override fun newPrincipal(): Principal {
        val userEntity = UserEntity()
        return PrincipalImpl(userEntity, userDao, roleDao, accessDao)
    }
}