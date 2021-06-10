package com.project.workout.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Date;

@Entity
@Data
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private Date startDate;

    private Date endDate;

    private Integer people;
    private int time;
    private BigDecimal price;
    private String memo;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer status;
}
