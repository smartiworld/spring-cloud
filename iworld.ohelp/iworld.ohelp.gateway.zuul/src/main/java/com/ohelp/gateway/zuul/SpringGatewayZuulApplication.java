package com.ohelp.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringGatewayZuulApplication {
	
	
    public static void main( String[] args ) {
    	SpringApplication.run(SpringGatewayZuulApplication.class, args);
    }
}
