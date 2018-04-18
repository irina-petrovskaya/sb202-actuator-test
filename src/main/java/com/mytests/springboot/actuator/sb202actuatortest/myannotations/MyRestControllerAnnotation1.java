package com.mytests.springboot.actuator.sb202actuatortest.myannotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/16/2016.
 * Project: restTest1
 * *******************************
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
public @interface MyRestControllerAnnotation1 {
    String value() default "";
}
