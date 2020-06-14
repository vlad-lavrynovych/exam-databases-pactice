package com.example.exam.service;

import com.example.exam.domain.Entity2;
import com.example.exam.repository.Entity2Repository;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;

@Service
public class Entity2Service implements EntityService {
    @Autowired
    private Entity2Repository entity2Repository;

    @Override
    public void process(String path2) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(path2));
        String[] line;
        while ((line = reader.readNext()) != null) {
            Entity2 entity2 = new Entity2();
            entity2.setId(Integer.parseInt(line[0]));
            entity2.setCategoryName(line[1]);
            entity2.setIndex(line[2]);
            System.out.println(entity2.toString());
            entity2Repository.save(entity2);
        }
    }

    @Override
    public void processWithHeader(String path1) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(path1));
        String[] line;
        reader.readNext(); //skipping the first line that contains headers
        while ((line = reader.readNext()) != null) {
            Entity2 entity2 = new Entity2();
            entity2.setId(Integer.parseInt(line[0]));
            entity2.setCategoryName(line[1]);
            entity2.setIndex(line[2]);
            System.out.println(entity2.toString());
            entity2Repository.save(entity2);
        }
    }
}
