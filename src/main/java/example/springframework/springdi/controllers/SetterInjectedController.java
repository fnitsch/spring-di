package example.springframework.springdi.controllers;

import example.springframework.springdi.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
