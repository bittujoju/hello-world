package com.example;

import org.springframework.web.bind.annotation.*;
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


    @RequestMapping("/volume/{length}/{width}/{height}")
    public int getIndividualParams(@PathVariable int length, @PathVariable int width, @PathVariable int height) {
        return length * width * height;
    }

    @PostMapping("/area")
    public String getObjectParams(AreaService area) {
        if (area.getType().equals("circle") && area.getRadius() != null)
            return String.format("Area of circle with radius %d is %f.", area.getRadius(), area.getRadius() * area.getRadius() * 3.14159);
        else if (area.getType().equals("rectangle") && area.getWidth() != null && area.getHeight() != null)
            return String.format("Area of %dx%d rectangle is %d.", area.getWidth(), area.getHeight(), area.getWidth() * area.getHeight());
        else
            return String.format("Invalid");
    }
}