package vitalii.rysich.springframework.controllers;

import vitalii.rysich.springframework.services.GreetingService;

public class ConstructedInjectionController {
    private GreetingService greetingService;

    public ConstructedInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
