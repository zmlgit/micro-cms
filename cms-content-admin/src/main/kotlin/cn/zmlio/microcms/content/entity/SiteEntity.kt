package cn.zmlio.microcms.content.entity

import javax.persistence.Column

data class SiteEntity(@Column(length = 32) val siteName: String) {
    @Column(length = 64)
    lateinit var siteDomain: String


}
