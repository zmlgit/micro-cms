package cn.zmlio.microcms.entity

import javax.persistence.*

@Table(name = "t_users")
@Entity
class UserEntity : BasicEntity() {

    @Column(length = 40, nullable = false, unique = true)
    var username: String? = null

    @Column(length = 40, nullable = false)
    var password: String? = null

    @Column(length = 40, nullable = false)
    var encrypt: String? = null

    @Column(length = 64, unique = true)
    var email: String? = null

    @Column(length = 15)
    var telephone: String? = null

    @ManyToMany(targetEntity = RoleEntity::class)
    @JoinTable(name = "t_user_roles", joinColumns = arrayOf(JoinColumn(name = "user_id")), inverseJoinColumns = arrayOf(JoinColumn(name = "role_id")))
    var roles: Set<RoleEntity>? = null
}
