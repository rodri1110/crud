package com.rodrigooliveira.aulacrud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigooliveira.aulacrud.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	ResponseEntity<User> findAll(){
	User u = new User(1L, "Maria", "maria@mail.com", "9018292819", "123456");
	return ResponseEntity.ok().body(u);
	}
}
