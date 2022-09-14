package com.kidzo.auth;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kidzo.auth.Repository.RoleRepository;
import com.kidzo.auth.entity.Role;

@SpringBootApplication
public class AuthenticationApplication implements CommandLineRunner{

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Role adminRole = new Role();
			adminRole.setId(1);
			adminRole.setName("ROLE_ADMIN");
			roleRepository.save(adminRole);

			Role userRole = new Role();
			userRole.setId(2);
			userRole.setName("ROLE_USER");
			roleRepository.save(userRole);
			
			List<Role> roles = List.of(adminRole,userRole);
			List<Role> result = this.roleRepository.saveAll(roles);
			
			result.forEach(r->{
				System.out.println(r.getName());
			});
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

