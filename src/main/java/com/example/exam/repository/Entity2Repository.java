package com.example.exam.repository;

import com.example.exam.domain.Entity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity2Repository extends JpaRepository<Entity2, Integer> {
}
