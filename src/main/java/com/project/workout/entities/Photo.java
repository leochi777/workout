package com.project.workout.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "WORKOUT_PHOTO")
public class Photo {
    @Id
    private Long id;
    private String photo;
    private Long userId;
    private Long courseId;
}
