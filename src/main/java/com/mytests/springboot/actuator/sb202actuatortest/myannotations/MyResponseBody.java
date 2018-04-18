package com.mytests.springboot.actuator.sb202actuatortest.myannotations;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/17/2016.
 * Project: restTest1
 * *******************************
 */

import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseBody
public @interface MyResponseBody {
}
