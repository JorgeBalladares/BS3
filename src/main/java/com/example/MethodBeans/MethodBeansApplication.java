package com.example.MethodBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MethodBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodBeansApplication.class, args);
	}

	@PostConstruct
	public void primera(){
		System.out.println("“Hola desde clase inicial");
	}
	@Bean
	Segunda saludo2(){
		return new Segunda();
	}
	@Bean
	Tercera saludo3(){
		return new Tercera();
	}

}


