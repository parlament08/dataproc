package practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class GetDates {

    static ArrayList<String> GetDatesFromTxt() {

        String line = null;
        ArrayList<String> ar = new ArrayList<String>();
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader("dates.csv");

            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
                ar.add(line);
            }

            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named dates.txt");
        }

        return ar;
    }

}
