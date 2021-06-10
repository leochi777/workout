package com.project.workout.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Table(name= "teamcourse")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="NO")
    private String no;

    @Column(name="TYPE")
    private String type;

    @Column(name="NAME")
    private String name;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "TIME")
    private String time;

    @Column(name = "LOCATION")
    private String location;

    @Column(name="PRICE")
    private Integer price;

    @Column(name = "LIMITED_PEOPLE")
    private  Integer limited_people;

    @Column(name = "DEADLINE_TIME")
    private Timestamp deadline_time;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name="CREATE_TIME")
    private Timestamp create_time;

    @Column(name="UPDATE_TIME")
    private Timestamp update_time;

}
