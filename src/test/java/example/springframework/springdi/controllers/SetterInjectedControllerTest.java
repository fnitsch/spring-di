package example.springframework.springdi.controllers;

import example.springframework.springdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }

    @Test
    void setGreetingService() {
    }
}