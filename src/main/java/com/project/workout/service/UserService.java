package com.project.workout.service;

import com.project.workout.dto.UserDto;
import com.project.workout.entities.User;

import java.util.List;

public interface UserService {

    void test();

    public String hello();

    public List<UserDto> getUsers() throws Exception;

    public void insertUser(UserDto userDto) throws Exception;

    public void updateUser(UserDto userDto) throws Exception;

    public void deleteUser(Long id) throws Exception;
}
