package com.phcproject.userdepartament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phcproject.userdepartament.model.User;
import com.phcproject.userdepartament.persistence.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> findAll() {
		List<User> usuarios = userRepository.findAll();
		return usuarios;
	}

	@GetMapping(value = "/{id}")
	public User find(@PathVariable Long id) {
		User usuario = userRepository.findById(id).get();
		return usuario;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User usuario = userRepository.save(user);
		return usuario;
	}
}
