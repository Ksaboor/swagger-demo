package com.khalilsaboor.springboot.swaggerdemo.Resource;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/add")
    public String helloAdd(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/udate")
    public String helloUpdate(@RequestBody final String hello){
        return hello;
    }

}
