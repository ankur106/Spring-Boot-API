package com.exam.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="roles")
public class Role {

    @Id
    private Long roleId;
    private String roleName;

<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
    private Set<UserRole> userRole;

=======
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "role")
    private Set<UserRole>   userRoles  = new HashSet<>();
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b

    public Role() {
    }

<<<<<<< HEAD
    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }

    public Role(Long roleId, String roleName, Set<UserRole> userRole) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.userRole = userRole;
=======
    public Role(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
<<<<<<< HEAD


=======
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
}
