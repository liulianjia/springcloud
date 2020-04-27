package com.llj.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.llj.springcloud.entity.User;

@Mapper
public interface UserDao {
	
	public boolean addUser(User user);

	public User getUser(int id);

	public List<User> getUsers();
}
