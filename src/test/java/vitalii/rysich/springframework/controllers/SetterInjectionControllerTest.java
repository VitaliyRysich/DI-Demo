package vitalii.rysich.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vitalii.rysich.springframework.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @BeforeEach
    public void setUp() throws Exception{
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO, setterInjectionController.sayHello());
    }
}