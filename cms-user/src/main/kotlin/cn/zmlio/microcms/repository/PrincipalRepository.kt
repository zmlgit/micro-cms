package cn.zmlio.microcms.repository

import cn.zmlio.microcms.domain.Principal

interface PrincipalRepository {

    fun newPrincipal(): Principal

    fun findPrincipalByUsername(username: String): Principal

}
