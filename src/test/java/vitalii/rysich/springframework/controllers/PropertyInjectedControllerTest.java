package vitalii.rysich.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vitalii.rysich.springframework.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
    }
}