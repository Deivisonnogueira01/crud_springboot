package com.crudweb.Deivison.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudweb.Deivison.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Deivison", "deivison@live.com", "9999", "123456");
		return ResponseEntity.ok().body(u);
		
		
		
	}
	
	
	
	
}
