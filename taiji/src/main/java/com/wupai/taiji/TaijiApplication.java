package com.wupai.taiji;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.ServerError;

@SpringBootApplication
public class TaijiApplication {

    public static void main(String[] args) {
        System.err.println("ads");
        SpringApplication.run(TaijiApplication.class, args);
    }

}
