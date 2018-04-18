package com.mytests.springboot.actuator.sb202actuatortest;

import com.mytests.springboot.actuator.sb202actuatortest.beans.User;
import com.mytests.springboot.actuator.sb202actuatortest.data.Message;
import com.mytests.springboot.actuator.sb202actuatortest.myannotations.MyGetMapping;
import com.mytests.springboot.actuator.sb202actuatortest.myannotations.MyRestControllerAnnotation3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
//@MyRestControllerAnnotation1("restController1")
//@MyRestControllerAnnotation2
@MyRestControllerAnnotation3()
public class MyRestController1 {

    private final User data;

    @Autowired
    public MyRestController1(User user) {
        this.data = user;
    }

    @MyGetMapping(mappath = "/")
    public String root(){
        return "root mapping";
    }
    @GetMapping(path = "/hello")
    public String showGreeting() {
        return "hello";
    }

    @RequestMapping(value = "/exit", method = RequestMethod.GET)
    public String exit(@ModelAttribute(name = "attr_from_rest_controllers_advice") String foo) {
        String rez = "have a nice day; i've got model attribute here also - " + foo;
        return rez;
    }

    @RequestMapping(value = "/hello/{user}")
    public Message showMessage(@PathVariable String user) {

        return new Message(user, data.getGreeting() + user);
    }


}