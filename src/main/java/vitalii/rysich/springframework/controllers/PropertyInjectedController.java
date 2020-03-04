package vitalii.rysich.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vitalii.rysich.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingServiceImpl;//Qualifier by name

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
