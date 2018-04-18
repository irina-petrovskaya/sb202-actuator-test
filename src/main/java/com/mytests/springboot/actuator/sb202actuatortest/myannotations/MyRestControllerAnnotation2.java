package com.mytests.springboot.actuator.sb202actuatortest.myannotations;

import org.springframework.web.bind.annotation.RestController;

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
@RestController
public @interface MyRestControllerAnnotation2 {
    String value() default "";
}
