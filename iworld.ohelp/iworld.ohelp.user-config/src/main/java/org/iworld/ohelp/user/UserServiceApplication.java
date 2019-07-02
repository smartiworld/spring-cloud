package org.iworld.ohelp.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {
    public static void main( String[] args ){
    	SpringApplication sa = new SpringApplication(UserServiceApplication.class);
    	sa.setWebApplicationType(WebApplicationType.SERVLET);
    	sa.run(args);
    	//new SpringApplicationBuilder(UserServiceApplication.class).web(true).run(args);
    }
}
