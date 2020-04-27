package com.llj.springcloud.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.llj.springcloud.entity.User;
import feign.hystrix.FallbackFactory;

@Component
public class ConsumerServiceFallbackFactory implements FallbackFactory<ConsumerService> {

	@Override
	public ConsumerService create(Throwable arg0) {

		return new ConsumerService() {
			
			@Override
			public List<User> getAll() {

				return null;
			}
			
			@Override
			public User get(int id) {
				User user = new User(id, "该用户不存在", "0");
				return user;
			}
			
			@Override
			public boolean add(User user) {

				return false;
			}
		};
	}

}
