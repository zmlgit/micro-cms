package cn.zmlio.microcms.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Table(name = "t_users")
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BasicEntity {

    @Column(length = 40, nullable = false, unique = true)
    private String username;

    @Column(length = 40, nullable = false)
    private String password;

    @Column(length = 40, nullable = false)
    private String encrypt;

    @Column(length = 64, unique = true)
    private String email;

    @Column(length = 15)
    private String telephone;

    @ManyToMany(targetEntity = RoleEntity.class)
    @JoinTable(name = "t_user_roles", joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<RoleEntity> roles;

}
