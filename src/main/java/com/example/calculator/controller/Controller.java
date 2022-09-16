package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class Controller {
    public final ControllerService controllerService;

    public Controller(ControllerService controllerService){
        this.controllerService = controllerService;
    }

    @GetMapping
    public String welcome(){
        return controllerService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2){
        return controllerService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2){
        return controllerService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2){
        return controllerService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        return controllerService.divide(num1, num2);
    }
}
