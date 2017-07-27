package cn.zmlio.microcms.repository

import cn.zmlio.microcms.aggregate.Principal

interface PrincipalRepository {

    fun newPrincipal(): Principal

}
