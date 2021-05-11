package com.project.workout.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_NO")
    private String product_no;

    @Column(name = "PATH")
    private String path;

}
