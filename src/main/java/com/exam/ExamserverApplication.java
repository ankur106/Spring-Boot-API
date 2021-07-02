package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(ExamServerApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Starting App");
//
//		User user = new User();
//
//		user.setFirstname("Ankur");
//		user.setEmail("Ankur@gmail.com");
//
//		user.setLastname("Patel");
//		user.setPassword("abc");
//		user.setPhone("9898872616");
//		user.setProfile("ankur.jpg");
//
//		Role role1 = new Role();
//		role1.setRoleId(1L);
//		role1.setRoleName("Student");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//
//		UserRole userrole = new UserRole();
//		userrole.setUser(user);
//		userrole.setRole(role1);
//
//		userRoleSet.add(userrole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getEmail());
//
//

	}
}
