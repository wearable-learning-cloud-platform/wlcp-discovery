package org.wlcp.wlcpdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WlcpDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WlcpDiscoveryApplication.class, args);
	}

}
