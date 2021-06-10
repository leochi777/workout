package com.project.workout.serviceImpl;

import com.project.workout.dao.UserRepository;
import com.project.workout.dto.UserDto;
import com.project.workout.entities.User;
import com.project.workout.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLDataException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private ModelMapper modelMapper;

    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

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
    public List<UserDto> getUsers() {
        List<User> users = this.userRepository.findAll();
        return users.stream()
                .map(this::covertToDto)
                .collect(Collectors.toList());

    }

    @Override
    @Transactional
    public void insertUser(UserDto userDto) {
        User user = covertToEntity(userDto);
        System.out.println(user);
        this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(UserDto userDto) throws Exception {
        User old_user = this.userRepository.findByEmail(userDto.getEmail());
        if (old_user != null) {
            User new_user = covertToEntity(userDto);
            new_user.setId(old_user.getId());
            new_user.setUpdate_time(new Timestamp(new Date().getTime()));
            this.userRepository.save(new_user);
        } else {
            throw new Exception("查無此資料");
        }
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }


    private UserDto covertToDto(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        userDto.setPassword(user.getPassword() + "toDto");
        return userDto;
    }

    private User covertToEntity(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        user.setCreate_time(new Timestamp(new Date().getTime()));
        return user;
    }
}
