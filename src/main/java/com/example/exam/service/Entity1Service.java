package com.example.exam.service;

import com.example.exam.domain.Entity1;
import com.example.exam.repository.Entity1Repository;
import com.example.exam.repository.Entity2Repository;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;

@Service
public class Entity1Service implements EntityService {
    @Autowired
    private Entity1Repository entity1Repository;
    @Autowired
    private Entity2Repository entity2Repository;

    public void process(String path1) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(path1));
        String[] line;

        while ((line = reader.readNext()) != null) {
            Entity1 entity1 = new Entity1();
            entity1.setId(Integer.parseInt(line[0]));
            entity1.setEntity2(entity2Repository.findById(Integer.valueOf(line[1])).get());
            entity1.setName(line[2]);
            entity1.setPrice(Float.parseFloat(line[3]));
            System.out.println(entity1.toString());
            entity1Repository.save(entity1);
        }
    }

    @Override
    public void processWithHeader(String path1) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(path1));
        String[] line;
        reader.readNext(); //skipping the first line that contains headers
        while ((line = reader.readNext()) != null) {
            Entity1 entity1 = new Entity1();
            entity1.setId(Integer.parseInt(line[0]));
            entity1.setEntity2(entity2Repository.findById(Integer.valueOf(line[1])).get());
            entity1.setName(line[2]);
            entity1.setPrice(Float.parseFloat(line[3]));
            System.out.println(entity1.toString());
            entity1Repository.save(entity1);
        }
    }
}
