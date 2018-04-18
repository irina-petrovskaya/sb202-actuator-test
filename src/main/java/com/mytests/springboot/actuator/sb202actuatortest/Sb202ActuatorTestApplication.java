package com.mytests.springboot.actuator.sb202actuatortest;

import com.mytests.springboot.actuator.sb202actuatortest.beans.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;

@SpringBootApplication
public class Sb202ActuatorTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb202ActuatorTestApplication.class, args);
    }

    @Bean(name = "user")
    @Description("just the utils bean that keeps 2 properties")
    public User user() {
        return new User("irina","welcome to the rest controller test");
    }
}
