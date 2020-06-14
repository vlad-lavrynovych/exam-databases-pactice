package com.example.exam.repository;

import com.example.exam.domain.Entity1;
import com.example.exam.domain.TestRetrieveEntity;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1, Integer> {
    //select item where name = laptop
    @Query(nativeQuery = true,
            value = "select * from entity1 where name='Laptop'")
    Entity1 findWhereNameLaptop();

    @Query(nativeQuery = true,
            value = "select * from entity1 " +
                    "join entity2 on entity1.category_id = entity2.id " +
                    "where name='Laptop'")
    Entity1 findWhereNameLaptopWithJoin();
}
