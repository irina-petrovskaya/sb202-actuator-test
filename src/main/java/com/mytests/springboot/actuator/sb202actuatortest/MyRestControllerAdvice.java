package com.mytests.springboot.actuator.sb202actuatortest;

import com.mytests.springboot.actuator.sb202actuatortest.myannotations.MyRestControllerAnnotation1;
import com.mytests.springboot.actuator.sb202actuatortest.myannotations.MyRestControllerAnnotation3;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/26/2016.
 * Project: restTest1
 * *******************************
 */
@RestControllerAdvice(annotations = {RestController.class, MyRestControllerAnnotation3.class})
public class MyRestControllerAdvice {
    @ModelAttribute(name = "attr_from_rest_controllers_advice")
    public String ma1(){
        return "model attribute from MyRestControllerAdvice";
    }
}
