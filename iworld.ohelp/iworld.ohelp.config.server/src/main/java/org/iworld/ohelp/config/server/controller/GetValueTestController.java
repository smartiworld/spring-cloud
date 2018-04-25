package org.iworld.ohelp.config.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetValueTestController {

	@Value("${app.name}")
	private String name;
	
	public String getValue() {
		return name;
	}
}
