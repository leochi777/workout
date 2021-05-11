package com.project.workout.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Data
@Table(name = "product")
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

    @Column(name="PRICE")
    private int price;

    @Column(name="CREATE_TIME")
    private Timestamp create_time;

    @Column(name="UPDATE_TIME")
    private Timestamp update_time;

}
