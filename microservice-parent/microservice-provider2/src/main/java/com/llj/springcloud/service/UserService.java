package com.llj.springcloud.service;

import java.util.List;
import com.llj.springcloud.entity.User;

public interface UserService {
	
	public boolean addUser(User user);

	public User getUser(int id);

	public List<User> getUsers();
}
