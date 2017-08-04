package cn.zmlio.microcms.entity

import javax.persistence.*

@Entity
@Table(name = "t_roles")
data class RoleEntity(@Column(length = 64)
                      var roleCode: String, @Column(length = 20)
                      var roleName: String,
                      @Column(length = 40)
                      var module: String,
                      var isModuleDefault: Boolean = false) : BasicEntity() {

    @JoinTable(name = "t_role_access", joinColumns = arrayOf(JoinColumn(name = "role_id")), inverseJoinColumns = arrayOf(JoinColumn(name = "access_id")))
    @ManyToMany
    var accesses: Set<AccessEntity>? = null

    override fun toString(): String {
        return "RoleEntity{" +
                "roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", module='" + module + '\'' +
                ", moduleDefault=" + isModuleDefault +
                "} " + super.toString()
    }
}
