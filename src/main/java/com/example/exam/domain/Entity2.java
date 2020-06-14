package com.example.exam.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entity2")
@Data
//C:\Users\dell\Desktop\data2.csv
public class Entity2 {
    @Id
    private int id;
    private String categoryName;
    private String index;
}
