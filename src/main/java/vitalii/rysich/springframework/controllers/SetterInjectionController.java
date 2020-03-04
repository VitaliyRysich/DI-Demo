package vitalii.rysich.springframework.controllers;

import vitalii.rysich.springframework.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
