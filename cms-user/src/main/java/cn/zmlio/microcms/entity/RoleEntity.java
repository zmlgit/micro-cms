package cn.zmlio.microcms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_roles")
public class RoleEntity extends BasicEntity {

    @Column(length = 64)
    private String roleCode;

    @Column(length = 20)
    private String roleName;

    @Column(length = 40)
    private String module;

    private boolean moduleDefault;

    @JoinTable(name = "t_role_access", joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "access_id")})
    @ManyToMany
    private Set<AccessEntity> accesses;

    @Override
    public String toString() {
        return "RoleEntity{" +
                "roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", module='" + module + '\'' +
                ", moduleDefault=" + moduleDefault +
                "} " + super.toString();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public boolean isModuleDefault() {
        return moduleDefault;
    }

    public void setModuleDefault(boolean moduleDefault) {
        this.moduleDefault = moduleDefault;
    }

    public Set<AccessEntity> getAccesses() {
        return accesses;
    }

    public void setAccesses(Set<AccessEntity> accesses) {
        this.accesses = accesses;
    }
}
