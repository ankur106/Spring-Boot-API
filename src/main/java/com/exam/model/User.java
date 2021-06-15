package com.exam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
<<<<<<< HEAD


import javax.persistence.*;
=======
import org.springframework.data.repository.cdi.Eager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
import java.util.Set;


@Entity
@Table(name="users")
public class User implements UserDetails
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String profile;

<<<<<<< HEAD
    // each user can have one role like student or faculty
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    @JsonIgnore
    private Set<UserRole> userRole;
=======
    private boolean enabled = true;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    @JsonIgnore
    private Set<UserRole> userRoles=new HashSet<>();

>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b

    public User() {
    }

<<<<<<< HEAD
    public User(Long id, String email, String password, String firstName, String lastName, String phone, boolean enabled, String profile, Set<UserRole> userRole) {
=======
    public User(Long id, String username, String password, String firstname, String lastname, String email, String phone, String profile, boolean enabled, Set<UserRole> userRole) {
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.profile = profile;
        this.enabled = enabled;
        this.userRoles = userRole;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
<<<<<<< HEAD
        this.userRole = userRole;
=======
    }

    public Set<UserRole> getUserRole() {
        return userRoles;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRoles = userRole;
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Set<Authority> set = new HashSet<>();

        this.userRoles.forEach(userRole -> {
            set.add(new Authority(userRole.getRole().getRoleName()));
        });
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
<<<<<<< HEAD

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }
=======
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
}
