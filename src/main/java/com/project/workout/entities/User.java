package com.project.workout.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "WORKOUT_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_ID")
    private Long id;
    private String email;
    private String password;
    private String name;
    private int sex;
    private Date birthday;
    private String cellphone;
    private int role;
    private int status;
}
