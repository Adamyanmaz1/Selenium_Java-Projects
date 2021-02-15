package com.ReadingFiles;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ApacheCommonsCSV {

    @Test
    public void readCSV() throws IOException {
        String CSV_File_Path = "/Users/memetiminabliz/Desktop/Memetimin/SeleniumMaster/seleniumtestautomation1/doc/login.csv";
        // read the file
        Reader reader = Files.newBufferedReader(Paths.get(CSV_File_Path));
        // parse the file into csv values
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        for (CSVRecord csvRecord : csvParser) {
            // Accessing Values by Column Index
            String name = csvRecord.get(0);
            String product = csvRecord.get(1);
            String description = csvRecord.get(2);
            // print the value to console
            System.out.println("Record No - " + csvRecord.getRecordNumber());
            System.out.println("---------------");
            System.out.println("Name : " + name);
            System.out.println("Product : " + product);
            System.out.println("Description : " + description);
            System.out.println("--------------- ");
        }
    }
}
