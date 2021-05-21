package com.project.workout.entities;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotBlank
    @Column(name="NAME")
    private String name;

    @NotNull
    @Column(name="SEX")
    private Integer sex;

    @Column(name="BIRTHDAY")
    private Date birthday;

    @Email
    @NotBlank
    @Column(name="EMAIL")
    private String email;

    @NotBlank
    @Column(name="PASSWORD")
    private String password;

    @NotBlank
    @Column(name="TEL")
    private String tel;

    @Column(name="LINK")
    private String link;

    @Column(name="ROLE")
    private Integer role;

    @Column(name="CREATE_TIME")
    private Timestamp create_time;

    @Column(name="UPDATE_TIME")
    private Timestamp update_time;

}
