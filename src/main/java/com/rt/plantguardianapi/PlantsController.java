package com.rt.plantguardianapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantsController {

    private static final String template = "Hello %s from Plants Guardian!";

    @RequestMapping("/hello-plants")
    public Plant helloPlant(@RequestParam(value="name", defaultValue = "World") String name) {
        return new Plant(0, String.format(template, name));
    }
}
