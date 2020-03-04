package vitalii.rysich.springframework.controllers;

import vitalii.rysich.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
