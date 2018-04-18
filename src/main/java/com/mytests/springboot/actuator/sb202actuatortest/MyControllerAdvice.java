package com.mytests.springboot.actuator.sb202actuatortest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/25/2016.
 * Project: restTest1
 * *******************************
 */
@ControllerAdvice(basePackages = "com.mytests.spring43.springmvc.rest.test1.controllers")
public class MyControllerAdvice {

 @ModelAttribute(name = "attr_from_controllers_advice")
    public String ma1(){
     return "model attribute from MyControllerAdvice";
 }
}
