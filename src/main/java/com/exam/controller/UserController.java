package com.exam.controller;

<<<<<<< HEAD

=======
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
<<<<<<< HEAD
public class UserController {
=======
@CrossOrigin("*")
public class UserController {

>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
    @Autowired
    private UserService userService;

    //creating user
    @PostMapping("/")
<<<<<<< HEAD
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return this.userService.createUser(user, roles);
    }

    @GetMapping("/{email}")
    public User getUser(@PathVariable("email") String email) {
        return this.userService.getUser(email);
    }

    //delete user by id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        this.userService.deleteUser(userId);
    }
}

=======
    public User creatUser(@RequestBody User user) throws Exception {


        Set<UserRole> roles  = new HashSet<>();

        Role role1 = new Role();
        role1.setRoleId(2L);
        role1.setRoleName("Normal");

        UserRole userrole = new UserRole();
        userrole.setUser(user);
        userrole.setRole(role1);

        roles.add(userrole);

        return this.userService.createUser(user,roles);

    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        this.userService.deleteUser(userId);
    }

}
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
