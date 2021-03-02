package com.project.workout.serviceImpl;

import com.project.workout.dao.UserRepository;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void test() {

    }

    @Override
    public String hello() {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
