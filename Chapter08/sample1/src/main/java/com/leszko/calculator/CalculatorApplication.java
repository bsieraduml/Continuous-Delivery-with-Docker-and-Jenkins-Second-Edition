package com.leszko.calculator;
//added by ben
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

/**
 * Main Spring Application.
 */
@SpringBootApplication
@EnableCaching
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public ClientConfig hazelcastClientConfig() {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getNetworkConfig().addAddress("hazelcast");
		//added by ben
		//clientConfig.getNetworkConfig().setClusterName("docker desktop");
		return clientConfig;
	}
}
