package org.iworld.ohelp.ipay.controller;

import java.net.URI;

import org.iworld.ohelp.ipay.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/micipay")
public class IPayController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@GetMapping(value = "/getuserinfo/{id}")
	public User getUserInfo(@PathVariable Integer id) {
		return restTemplate.getForObject("http://MICSERVICE.USER/micuser/userinfo/" + id, User.class);
	}
	
	@GetMapping(value = "/getuserinfo_loaded/{id}")
	public ServiceInstance getUserInfoOfLoaded(@PathVariable Integer id) {
		ServiceInstance serviceInstance = loadBalancerClient.choose("MICSERVICE.USER");
		URI serviceUri = serviceInstance.getUri();
		System.out.println("host:" + serviceInstance.getHost() + ",port:" + serviceInstance.getPort() + ",url:" + serviceUri);
		String query = serviceUri.getQuery();
		System.out.println("query=====" + query);
		return serviceInstance;
	}
	
	@GetMapping(value = "/pay/{id}")
	public String pay(@PathVariable Integer id) {
		return id.toString();
	}
}
