package com.example.schedularzdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedularzDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedularzDemoApplication.class, args);
    }

}
