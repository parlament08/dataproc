package practice2;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BasicCSVReader {

    private static final String SAMPLE_CSV_FILE_PATH = "dates.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String date = csvRecord.get(0);

                NetClientGet clientGet =  new NetClientGet();
                clientGet.GetListCurrencies(date);

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("DateClass : " + date);
                System.out.println("---------------\n\n");
            }
        }
    }

}
