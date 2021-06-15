package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;
import org.springframework.stereotype.Service;


import java.util.Set;


public interface UserService {


    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

<<<<<<< HEAD
    //get user by email
    public User getUser(String email);


    //delete user by id
=======
    //get user by username
    public User getUser(String username);

    //get delete user by userId
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
    public void deleteUser(Long id);
}
