package com.appEstate.testservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class flat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int flat_id;
    private  int user_id;
    private String tower_address;
    private int floor_num;
    private double price;
}



