package org.iworld.ohelp.ipay;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class OHelpIpayApplication {
	
    public static void main( String[] args ) {
    	SpringApplicationBuilder sab = new SpringApplicationBuilder(OHelpIpayApplication.class);
    	sab.run(args);
    }
}
