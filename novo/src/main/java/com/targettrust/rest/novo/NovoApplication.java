package com.targettrust.rest.novo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

import com.targettrust.rest.novo.controller.HelloWorldController;

@SpringBootApplication
// @ComponentScan(basePackages= {"com.targettrust.mariazinha.tiozinho"}) 
// mapeando o pacote caso não esteja com o todo o nome.
public class NovoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovoApplication.class, args);
	}

}
