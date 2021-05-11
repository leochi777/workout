package com.project.workout.entities;

import lombok.Data;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="NO")
    private String no;

    @Column(name="NAME")
    private String name;

    @Column(name="SEX")
    private int sex;

    @Column(name="BIRTHDAY")
    private Date birthday;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="TEL")
    private String tel;

    @Column(name="ROLE")
    private int role;

    @Column(name="CREATE_TIME")
    private Timestamp create_time;

    @Column(name="UPDATE_TIME")
    private Timestamp update_time;

}
