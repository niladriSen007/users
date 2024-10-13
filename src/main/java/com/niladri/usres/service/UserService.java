package com.niladri.usres.service;

import com.niladri.usres.entity.User;
import com.niladri.usres.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
@AllArgsConstructor
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@CachePut(value = "user", key = "#user.userId")
	public User createUser(User user) {
		return userRepository.save(user);

	}

	@Cacheable(value = "user", key = "#userId")
	public User getUser(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}
}
