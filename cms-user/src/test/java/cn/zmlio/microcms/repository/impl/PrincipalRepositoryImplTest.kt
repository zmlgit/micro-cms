package cn.zmlio.microcms.repository

import org.junit.Assert
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource


@SpringBootTest
@RunWith(SpringRunner::class)
class PrincipalRepositoryTest {

    @Resource
    lateinit var principalRepository: PrincipalRepository

    @Before
    fun before() {

    }

    @org.junit.Test
    fun newPrincipal() {
        val principal = principalRepository.newPrincipal();

        principal.user

        Assert.assertNotNull(principalRepository.newPrincipal())
    }

}