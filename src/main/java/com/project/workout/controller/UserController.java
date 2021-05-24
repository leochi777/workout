package com.project.workout.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.workout.dto.UserDto;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import com.project.workout.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private UserService userService;
    private ResponseVO responseVO;

    @Autowired
    public void setResponseVO(ResponseVO responseVO) {
        this.responseVO = responseVO;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseVO> getUsers() {
        try {
            List<UserDto> users = userService.getUsers();
            responseVO.setData(objectMapper.writeValueAsString(users));
            responseVO.setCode(HttpStatus.OK.value());
            responseVO.setMsg("查詢成功");
//            return ResponseEntity.status(HttpStatus.OK).body(responseVO);
        } catch (Exception e) {
            responseVO.setCode(HttpStatus.NOT_FOUND.value());
            responseVO.setMsg("查詢失敗");
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseVO);
        }
        return ResponseEntity.status(responseVO.getCode()).body(responseVO);
    }

    @PostMapping("/user")
    public ResponseEntity<ResponseVO> insertUser(@Valid @RequestBody UserDto userDto) {
        try {
            this.userService.insertUser(userDto);
            responseVO.setCode(HttpStatus.OK.value());
            responseVO.setMsg("新增成功");
        } catch (Exception e) {
            responseVO.setCode(HttpStatus.BAD_REQUEST.value());
            responseVO.setMsg("新增失敗");
        }
        return ResponseEntity.status(responseVO.getCode()).body(responseVO);
    }

    @PutMapping("/user")
    public ResponseEntity<ResponseVO> updateUser(@Valid @RequestBody UserDto userDto) {
        try {
            this.userService.updateUser(userDto);
            responseVO.setCode(HttpStatus.OK.value());
            responseVO.setMsg("更新成功");
        } catch (Exception e) {
            responseVO.setCode(HttpStatus.BAD_REQUEST.value());
            responseVO.setMsg("更新失敗");
        }
        return ResponseEntity.status(responseVO.getCode()).body(responseVO);
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
