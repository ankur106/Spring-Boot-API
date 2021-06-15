package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
<<<<<<< HEAD

=======
>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
<<<<<<< HEAD
=======

>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(ExamserverApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
<<<<<<< HEAD
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
=======
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

>>>>>>> 733d3edb0458e08949935dfb0ef72942c55b3b6b
	}
}
