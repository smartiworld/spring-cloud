package org.iworld.ohelp.user.controller;

import org.iworld.ohelp.user.model.User;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class UserServiceController {

	public String findUser() {
		User user = new User();
		user.setName("zhangsan");
		user.setUserId(1);
		Gson gson = new Gson();
		String sUser = gson.toJson(user);
		return sUser;
	}
	
}
