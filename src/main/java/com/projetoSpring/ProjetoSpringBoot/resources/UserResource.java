package com.projetoSpring.ProjetoSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.ProjetoSpringBoot.entities.User;

//avisando q é um recurso web
@RestController
@RequestMapping(value = "/users")

public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1l,"Maria","maria@gmail.com","379995120090", "senha132");
		return ResponseEntity.ok().body(u);
	}
}
