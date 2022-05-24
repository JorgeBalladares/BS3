package com.example.MethodBeans;

import org.springframework.boot.CommandLineRunner;

public class Segunda implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
            System.out.println("Hola desde clase secundaria");
    }
}
