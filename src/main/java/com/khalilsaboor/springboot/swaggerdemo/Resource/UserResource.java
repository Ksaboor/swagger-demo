package com.khalilsaboor.springboot.swaggerdemo.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        );
    }
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName, 1000L);
    }
    private class User {
        private String userName;
        private Long salary;

        public User(String userName, Long salary){
            this.userName = userName;
            this.salary = salary;

        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
