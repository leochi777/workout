package com.project.workout.service;

import com.project.workout.entities.User;

import java.util.List;

public interface UserService {

    void test();

    public String hello();

    public List<User> getUsers();

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(Long id);
}
