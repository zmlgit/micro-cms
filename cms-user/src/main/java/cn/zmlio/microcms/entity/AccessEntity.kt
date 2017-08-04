package cn.zmlio.microcms.entity

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "t_access")
@Entity
data class AccessEntity(var path: String, var privilege: Int) : BasicEntity() {

}
