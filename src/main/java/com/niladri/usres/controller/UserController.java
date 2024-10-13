package com.niladri.usres.controller;

import com.niladri.usres.entity.User;
import com.niladri.usres.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId) {
		return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
	}
}
