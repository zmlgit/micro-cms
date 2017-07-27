package cn.zmlio.microcms.repository.impl

import cn.zmlio.microcms.repository.PrincipalRepository
import org.junit.Assert
import org.junit.Before

class PrincipalRepositoryImplTest {

    lateinit var principalRepository: PrincipalRepository

    @Before
    fun before() {
        principalRepository = PrincipalRepositoryImpl()
    }

    @org.junit.Test
    fun newPrincipal() {
        Assert.assertNotNull(principalRepository.newPrincipal())
    }

}