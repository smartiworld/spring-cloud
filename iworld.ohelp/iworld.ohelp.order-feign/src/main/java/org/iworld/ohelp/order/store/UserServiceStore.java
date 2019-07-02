package org.iworld.ohelp.order.store;

import org.iworld.ohelp.order.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "")
public interface UserServiceStore {

	@GetMapping(value = "/userinfo/{id}")
	public User findUser(@PathVariable Integer id) ;
}
