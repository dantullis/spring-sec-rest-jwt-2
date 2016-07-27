package com.domain.backend.service;

import com.domain.backend.model.User;

public interface UserService {
	User save(User user);

	User findByUserName(String username);
}
