package org.iworld.ohelp.ribbon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * 不让spring @ComponentScan 扫描此类，如果扫描 所有ribbon client 使用此配置
 * @author admin
 *
 */
@Configuration
public class UserServiceRibbonConfig {

	@Bean
	public IRule randomRule() {
		return new RoundRobinRule();
	}
}
