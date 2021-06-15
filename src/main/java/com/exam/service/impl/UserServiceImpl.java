package com.exam.service.impl;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByEmail(user.getEmail());
        if(local!= null) {
            System.out.println("User present");
            throw new Exception("User present");
        } else {
            for(UserRole ur:userRoles) {
                roleRepository.save(ur.getRole());
            }

<<<<<<< HEAD
            user.setUserRole(userRoles);
=======
            user.getUserRole().addAll(userRoles);
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
            local = this.userRepository.save(user);
        }
        return local;
    }

<<<<<<< HEAD
    //getting user by email
    @Override
    public User getUser(String email) {
        return this.userRepository.findByEmail(email);
    }




    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
=======
    //getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByusername(username);
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }


}
