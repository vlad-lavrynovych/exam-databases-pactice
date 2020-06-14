package com.example.exam;

import com.example.exam.repository.Entity1Repository;
import com.example.exam.repository.Entity2Repository;
import com.example.exam.repository.TestRetrieveEntityRepository;
import com.example.exam.service.Entity1Service;
import com.example.exam.service.Entity2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {
    @Autowired
    private Entity1Service entity1Service;
    @Autowired
    private Entity2Service entity2Service;
    @Autowired
    private Entity1Repository entity1repository;
    @Autowired
    private Entity2Repository entity2repository;
    @Autowired
    private TestRetrieveEntityRepository testRetrieveEntityRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Path1: ");     //Absolute csv1 file path
        String path1 = scanner.next();
        System.out.print("Path2: ");     //Absolute csv2 file path
        String path2 = scanner.next();

//        entity2Service.processWithHeader(path2);
//        entity1Service.processWithHeader(path1);
        System.out.println("==================================================================");
        entity2Service.process(path2);
        System.out.println("==================================================================");
        entity1Service.process(path1);
        System.out.println("==================================================================");
        System.out.println(entity1repository.findWhereNameLaptop().toString());
        System.out.println("==================================================================");
        testRetrieveEntityRepository.selectCategoryIdAndAveragePrice().forEach(System.out::println);
        System.out.println("==================================================================");
        System.out.println(entity1repository.findWhereNameLaptopWithJoin().toString());
        System.out.println("==================================================================");
    }
}
