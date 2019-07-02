package org.iworld.ohelp.order.controller;

import org.iworld.ohelp.order.entity.User;
import org.iworld.ohelp.order.store.UserServiceStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ouser")
public class UserController {

	@Autowired
	private UserServiceStore userSeviceStore;
	
	@RequestMapping(value = "/getuser/{id}")
	public User getUser(@PathVariable("id") String id) {
		//userSeviceStore.findUser(id);
		return null;
	}
}
