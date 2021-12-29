package com.crudweb.Deivison.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudweb.Deivison.entities.User;
import com.crudweb.Deivison.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		                   //null pq o banco gera automaticamente
		User u1 = new User(null,"Caio", "caio@gmail.com","758000", "123456");
		User u2 = new User(null,"Mario", "ms.12@live.com", "157480", "147000");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
