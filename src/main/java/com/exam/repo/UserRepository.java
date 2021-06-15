package com.exam.repo;

import com.exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);


=======
public interface UserRepository extends JpaRepository<User,Long>  {

    public User findByEmail(String useremail);

    public User findByusername(String username);
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
}
