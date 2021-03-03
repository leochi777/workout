package com.project.workout.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "WORKOUT_ORDER")
public class Order {
    @Id
    private Long id;
    private Long userId;
    private Long courseId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private int status;
}
