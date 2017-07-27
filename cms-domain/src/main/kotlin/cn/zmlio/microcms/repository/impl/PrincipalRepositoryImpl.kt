package cn.zmlio.microcms.repository.impl

import cn.zmlio.microcms.aggregate.Principal
import cn.zmlio.microcms.aggregate.impl.PrincipalImpl
import cn.zmlio.microcms.entity.UserEntity
import cn.zmlio.microcms.repository.PrincipalRepository
import org.springframework.stereotype.Repository

@Repository
class PrincipalRepositoryImpl : PrincipalRepository {

    override fun newPrincipal(): Principal {
        val userEntity = UserEntity()
        return PrincipalImpl(userEntity)
    }
}