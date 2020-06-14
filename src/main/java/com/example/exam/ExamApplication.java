package com.example.exam;

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

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Path1: ");                  //C:\Users\dell\Desktop\data1.csv
        String path1 = scanner.next();
        System.out.print("Path2: ");                  //C:\Users\dell\Desktop\data2.csv
        String path2 = scanner.next();

//        entity2Service.processWithHeader(path2);
//        entity1Service.processWithHeader(path1);

        entity2Service.process(path2);
        entity1Service.process(path1);
    }
}
