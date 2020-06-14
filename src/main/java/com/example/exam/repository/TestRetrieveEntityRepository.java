package com.example.exam.repository;

import com.example.exam.domain.TestRetrieveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TestRetrieveEntityRepository extends JpaRepository<TestRetrieveEntity, Integer> {
    //select category id ant it's average price
    @Query(nativeQuery = true,
            value = "select category_id, avg(price) as price from entity1 group by category_id" +
                    " order by category_id")
    List<TestRetrieveEntity> selectCategoryIdAndAveragePrice();
}
