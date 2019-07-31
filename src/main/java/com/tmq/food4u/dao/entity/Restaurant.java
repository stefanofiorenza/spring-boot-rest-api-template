package com.tmq.food4u.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Author: quytm
 * Email : minhquylt95@gmail.com
 * Date  : Jul 31, 2019
 */
@Entity
@Getter
@Setter
@Table(name = "restaurants")
public class Restaurant implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, unique = true)
    private String code;

    @Column(length = 100)
    private String name;

    @Column(length = 500)
    private String summary;

    @Column(length = 200)
    private String image;

    @Column(length = 200)
    private String coverImage;

    @Column(length = 5)
    private String openTime;

    @Column(length = 5)
    private String closeTime;

    @Column(length = 200)
    private String address;

    @Column(columnDefinition = "integer(1) default 0.0")
    private Double rating;

}
