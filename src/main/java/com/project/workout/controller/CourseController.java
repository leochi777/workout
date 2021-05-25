package com.project.workout.controller;

import com.project.workout.vo.ResponseVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping("/courseList")
    public ResponseEntity<ResponseVO> getCourses(){

    }
}
