package com.gestion.restau;

import com.gestion.restau.security.Services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestauApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestauApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(AccountService accountService) {
		return args -> {
//            accountService.CreateUser("hind","123","hind@gmail.com","123");
////            accountService.CreateRole("ADMIN");
////            accountService.CreateRole("CLIENT");
//
//            accountService.AddRoleToUser("admin","ADMIN");
//            accountService.AddRoleToUser("client","CLIENT");
			//System.out.println(accountService.loadUserByUsername("admin").getEmail());
		};
	}

}