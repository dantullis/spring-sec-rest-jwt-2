package com.domain.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.domain.backend.model.User;
import com.domain.backend.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserResources {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/users")
	public String loginSuccess() {
		return "Login Successful!";
	}

	@RequestMapping(value = "/user/username", method = RequestMethod.POST)
	public User findByUserName(@RequestBody String username) {
		return userService.findByUserName(username);
	}

	@RequestMapping(value = "/user/update", method = RequestMethod.POST)
	public User updateUser(@RequestBody User user) {
		return userService.save(user);
	}
}
