package org.iworld.ohelp.order;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
public class OHelpOrderApplication {
	
    public static void main( String[] args ) {
    	SpringApplicationBuilder sab = new SpringApplicationBuilder(OHelpOrderApplication.class);
    	sab.run(args);
    }
}
