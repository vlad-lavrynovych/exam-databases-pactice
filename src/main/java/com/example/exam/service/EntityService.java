package com.example.exam.service;

import java.io.IOException;

public interface EntityService {

    /**
     * @param path path to the csv file
     */
    public void process(String path) throws IOException;

    /**
     * @param path path to the csv file
     * @implSpec need to be used when the first line of csv file
     * contains headers of table columns in order
     * to skip them
     */
    void processWithHeader(String path) throws IOException;
}
