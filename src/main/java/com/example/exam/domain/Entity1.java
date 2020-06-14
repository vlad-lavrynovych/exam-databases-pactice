package com.example.exam.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "entity1")
@Data
//C:\Users\dell\Desktop\data1.csv
public class Entity1 {
    @Id
    private int id;
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Entity2.class)
    @JoinColumn(name = "category_id")
    private Entity2 entity2;
    private String name;
    private float price;
}
