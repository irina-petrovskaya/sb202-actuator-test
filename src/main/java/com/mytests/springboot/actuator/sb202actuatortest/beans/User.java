package com.mytests.springboot.actuator.sb202actuatortest.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/25/2016.
 * Project: restTest1
 * *******************************
 */
public class User {

    String name;
    private String greeting;

    public User(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
