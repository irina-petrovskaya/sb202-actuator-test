package com.mytests.springboot.actuator.sb202actuatortest.myannotations;

import org.springframework.stereotype.Controller;

import java.lang.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/17/2016.
 * Project: restTest1
 * *******************************
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@MyResponseBody
public @interface MyRestControllerAnnotation3 {
    String value() default "restController";
}
