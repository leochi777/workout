package com.project.workout.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    public String insertUser(User user){
        try{
            if(user!=null){
                System.out.println(user);
                this.userService.insertUser(user);
            }
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    @PutMapping("/user")
    public String updateUser(User user){
        try{
            if(user!=null){
                this.userService.updateUser(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/user")
    public String deleteUser(User user){
        try{
            if(user!=null){
                this.userService.deleteUser(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
