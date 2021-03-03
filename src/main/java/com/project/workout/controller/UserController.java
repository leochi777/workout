package com.project.workout.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.workout.dao.UserRepository;
import com.project.workout.dto.OrderResponse;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
//    ObjectMapper objectMapper = new ObjectMapper();
    private final Map<String,Object> returnMap=new HashMap<>();
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/test")
    public List<Object> test() {
        return userRepository.getJoinInform();
    }

    @GetMapping("/users")
    public ResponseEntity<Map<String,Object>> getUsers() {
        ResponseEntity<Map<String,Object>> resp = null;
        try {
            List<User> dataList = this.userService.getUsers();
            returnMap.put("dataList",dataList);
            resp = new ResponseEntity<>(returnMap, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    @PostMapping("/user")
    public ResponseEntity<String> insertUser(User user) {
        ResponseEntity<String> resp = null;
        StringBuilder sbd = new StringBuilder();
        try {
            if (user != null) {
                System.out.println(user);
                this.userService.insertUser(user);
                sbd.append("success");
                resp = new ResponseEntity<>(sbd.toString(), HttpStatus.OK);
            }

        } catch (Exception e) {
            e.printStackTrace();
            sbd.append("fail");
            resp = new ResponseEntity<>(sbd.toString(), HttpStatus.NOT_FOUND);
        }
        return resp;
    }

    @PutMapping("/user")
    public ResponseEntity<String> updateUser(User user) {
        ResponseEntity<String> resp = null;
        StringBuilder sbd = new StringBuilder();
        try {
            if (user != null) {
                this.userService.updateUser(user);
                sbd.append("success");
                resp = new ResponseEntity<>(sbd.toString(), HttpStatus.OK);

            }
        } catch (Exception e) {
            e.printStackTrace();
            sbd.append("fail");
            resp = new ResponseEntity<>(sbd.toString(), HttpStatus.NOT_FOUND);

        }
        return resp;
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        ResponseEntity<String> resp = null;
        StringBuilder sbd = new StringBuilder();
        try {
            if (id != null) {
                this.userService.deleteUser(id);
                sbd.append("success");
                resp = new ResponseEntity<>(sbd.toString(), HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
            sbd.append("fail");
            resp = new ResponseEntity<>(sbd.toString(), HttpStatus.NOT_FOUND);

        }
        return resp;
    }
}
