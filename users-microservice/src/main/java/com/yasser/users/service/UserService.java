package com.yasser.users.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yasser.users.entities.Role;
import com.yasser.users.entities.User;

@Component
public interface UserService {
	User saveUser(User user); User findUserByUsername (String username);
	Role addRole(Role role); User addRoleToUser(String username, String rolename);
}
