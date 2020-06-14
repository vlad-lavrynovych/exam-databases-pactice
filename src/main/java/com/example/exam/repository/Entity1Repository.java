package com.example.exam.repository;

import com.example.exam.domain.Entity1;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1, Integer> {
}
