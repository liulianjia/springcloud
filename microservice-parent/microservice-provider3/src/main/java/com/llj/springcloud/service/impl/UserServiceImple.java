package com.llj.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llj.springcloud.dao.UserDao;
import com.llj.springcloud.entity.User;
import com.llj.springcloud.service.UserService;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		boolean flag;
		flag = userDao.addUser(user);
		return flag;
	}

	@Override
	public User getUser(int id) {
		User user = userDao.getUser(id);
		System.out.println("microservice-provider3微服务在响应客户端请求……");
		System.out.println("user : " + user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.getUsers();
		return users;
	}

}
