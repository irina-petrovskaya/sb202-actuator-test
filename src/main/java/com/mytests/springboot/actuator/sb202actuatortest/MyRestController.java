package com.mytests.springboot.actuator.sb202actuatortest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/16/2018.
 * Project: sb202-actuator-test
 * *******************************
 */
@RestController
@RequestMapping("/test")
public class MyRestController {

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }
}
