package com.allied;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader1 {

    public static void main(String[] args) {

        String csvFile = "country.csv";
        //BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            //br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
