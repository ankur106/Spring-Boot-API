package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;

import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(ExamserverApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Code is running");
	/*	User user = new User();
		user.setEmail("upadhyayharsh19@gmail.com");
		user.setFirstName("Harsh");
		user.setLastName("Upadhyay");
		user.setPassword("abc");
		user.setPhone("123");
		user.setProfile("abc.jpg");


		Role role = new Role();
		role.setRoleId(1L);
		role.setRoleName("ADMIN");

		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);


		User user1 = this.userService.createUser(user, userRole);
		System.out.println(user1.getEmail());*/
	}
}
