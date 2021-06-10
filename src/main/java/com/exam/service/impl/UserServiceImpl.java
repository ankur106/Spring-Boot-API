package com.exam.service.impl;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUserEmail(user.getEmail());
        if(local!= null) {
            System.out.println("User present");
            throw new Exception("User present");
        } else {
            for (UserRole ur:userRoles) {
                roleRepository.save(ur.getRole());
            }
        }
        return null;
    }
}
