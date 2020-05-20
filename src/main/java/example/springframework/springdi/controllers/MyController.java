package example.springframework.springdi.controllers;

import example.springframework.springdi.SpringDiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Hello from Controller";
    }

}
