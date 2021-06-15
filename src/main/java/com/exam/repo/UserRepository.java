package com.exam.repo;

import com.exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>  {

    public User findByEmail(String useremail);

    public User findByusername(String username);
}
