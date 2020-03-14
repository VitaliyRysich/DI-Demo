package vitalii.rysich.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructedInjectionControllerTest {
    private ConstructedInjectionController constructedInjectionController;

    @BeforeEach
    public void setUp() throws Exception{
        this.constructedInjectionController = new ConstructedInjectionController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO, constructedInjectionController.sayHello());
    }
}