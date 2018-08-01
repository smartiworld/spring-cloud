package org.iworld.ohelp.ribbon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class UserServiceRibbonConfig {

	@Bean
	public IRule randomRule() {
		return new RandomRule();
	}
}
