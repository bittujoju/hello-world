package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/math")
public class HelloController {

    @GetMapping("/pi")
    public String helloWorld() {
        return "3.141592653589793";
    }

    @GetMapping("/calculate")
    public Integer myCoolMethod(MathService mathService) {

        if (mathService.getOperation() != null) {
            switch (mathService.getOperation()) {
                case "add":
                    return mathService.getX() + mathService.getY();
                case "subtract":
                    return mathService.getX() - mathService.getY();
                case "multiply":
                    return mathService.getX() * mathService.getY();
                case "divide":
                    return mathService.getX() / mathService.getY();
                default:
                    return mathService.getX() + mathService.getY();
            }
        }
        else
            return mathService.getX() + mathService.getY();
    }

    @GetMapping("/sum")
    public Integer listSum(MathService mathService) {
        return mathService.getN().stream()
                .reduce(0, (a, b) -> a + b);
    }

}