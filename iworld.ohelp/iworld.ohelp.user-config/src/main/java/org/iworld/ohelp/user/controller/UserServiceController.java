package org.iworld.ohelp.user.controller;

import org.iworld.ohelp.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/micuser")
public class UserServiceController {

	@GetMapping(value = "/userinfo/{id}")
	public User findUser(@PathVariable Integer id) {
		User user = new User();
		user.setName("zhangsan" + id);
		user.setUserId(id);
		System.out.println("当前时间:" + System.currentTimeMillis() + "user:" + user);
		return user;
	}
	
	@PostMapping(value = "/saveuser")
	public User saveUser(@PathVariable Integer id, String name) {
		User user = new User();
		user.setName(name);
		user.setUserId(id);
		System.out.println("当前时间:" + System.currentTimeMillis() + "user:" + user);
		return user;
	}
	
}
