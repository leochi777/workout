package com.project.workout.service;

import com.project.workout.dto.UserDto;
import com.project.workout.entities.User;

import java.util.List;

public interface UserService {

    void test();

    public String hello();

    public List<UserDto> getUsers();

    public void insertUser(UserDto userDto);

    public void updateUser(User user);

    public void deleteUser(Long id);
}
