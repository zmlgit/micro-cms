package cn.zmlio.microcms.entity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "t_users")
@Entity
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
    @JoinTable(name = "t_user_roles", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<RoleEntity> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }
}
