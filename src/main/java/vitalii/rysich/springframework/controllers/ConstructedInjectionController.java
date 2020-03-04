package vitalii.rysich.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vitalii.rysich.springframework.services.GreetingService;
@Controller
public class ConstructedInjectionController {
    private GreetingService greetingService;

    @Autowired
    public ConstructedInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
