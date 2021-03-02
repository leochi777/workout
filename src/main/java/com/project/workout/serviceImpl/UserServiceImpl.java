package com.project.workout.serviceImpl;

import com.project.workout.dao.UserRepository;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public void insertUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {

    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        this.userRepository.deleteById(user.getId());
    }
}
