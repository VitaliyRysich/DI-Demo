package vitalii.rysich.springframework.controllers;

import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello(){
        System.out.println(greetingService.sayGreeting());
    }
}
