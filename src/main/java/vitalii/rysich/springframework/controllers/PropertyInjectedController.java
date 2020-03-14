package vitalii.rysich.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;//Qualifier by name

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
