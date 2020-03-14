package vitalii.rysich.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import vitalii.rysich.springframework.services.GreetingService;
@Controller
public class ConstructedInjectionController {
    private GreetingService greetingService;

    public ConstructedInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
