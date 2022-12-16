package com.hcl.serverconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerApplication {

	@Value("msg")
	static String msg;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
		
		System.out.println(msg);
	}

}
