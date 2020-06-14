package com.example.exam.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TestRetrieveEntity {
    @Id
    private int category_id;
    private float price;
}
