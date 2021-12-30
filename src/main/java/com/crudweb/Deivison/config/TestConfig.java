package com.crudweb.Deivison.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudweb.Deivison.entities.Category;
import com.crudweb.Deivison.entities.Order;
import com.crudweb.Deivison.entities.User;
import com.crudweb.Deivison.entities.enuns.OrderStatus;
import com.crudweb.Deivison.repositories.CategoryRepository;
import com.crudweb.Deivison.repositories.OrderRepository;
import com.crudweb.Deivison.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		//null pq o banco gera automaticamente
		User u1 = new User(null,"Caio", "caio@gmail.com","758000", "123456");
		User u2 = new User(null,"Mario", "ms.12@live.com", "157480", "147000");
		
		                                           /// ISO 8601
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.SHIPPED, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1); 

		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o1));
	}
	
	
}
