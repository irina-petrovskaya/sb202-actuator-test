package com.mytests.springboot.actuator.sb202actuatortest.myannotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/18/2018.
 * Project: sb202-actuator-test
 * *******************************
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping(method = RequestMethod.GET)
public @interface MyGetMapping {

    @AliasFor(attribute = "path", annotation = RequestMapping.class)
    String[] mappath() default {};
}
