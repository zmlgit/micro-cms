package cn.zmlio.microcms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_roles")
@Data
public class RoleEntity extends BasicEntity {

    @Column(length = 64)
    private String roleCode;

    @Column(length = 20)
    private String roleName;

    @JoinTable(name = "t_role_access", joinColumns = {@JoinColumn(name = "access_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<AccessEntity> accesses;

}
