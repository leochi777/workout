package com.project.workout.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Date;

@Entity
@Data
@Table(name = "WORKOUT_COURSE")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;
    private int people;
    private int time;
    private BigDecimal price;
    private String memo;
    private Timestamp createTime;
    private Timestamp updateTime;
    private int status;
}
