package com.project.workout.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> dataList=null;
        try{
            dataList=this.userService.getUsers();

        }catch (Exception e){
            e.printStackTrace();
        }
        return dataList;
    }
    @PostMapping("/user")
    public String insertUser(Map map){
        System.out.println(map);
        return "success";
    }

}
