package com.khalilsaboor.springboot.swaggerdemo.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUser(){
        return Arrays.asList(
                new User("Louis", 1000L),
                new User("Peter", 2000L)
        )
    }
    private class User {
        private String userName;

    }
}
