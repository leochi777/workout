package com.project.workout.dto;

import com.project.workout.entities.Course;
import com.project.workout.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private Long userId;
    private String userName;
    private String courseName;
    private String courseMemo;
}
