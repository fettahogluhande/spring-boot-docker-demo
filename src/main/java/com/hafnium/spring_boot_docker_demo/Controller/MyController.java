package com.hafnium.spring_boot_docker_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test-docker")
    public String getData(){
        return "Hello Docker";
    }

}
