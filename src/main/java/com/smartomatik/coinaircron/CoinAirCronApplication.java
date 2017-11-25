package com.smartomatik.coinaircron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoinAirCronApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinAirCronApplication.class, args);
	}
}
