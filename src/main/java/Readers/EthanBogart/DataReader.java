package Readers.EthanBogart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Ethan Bogart on 10/5/16.
 */
public class DataReader {
    public ArrayList<Facility> facilities;

    public DataReader() {
        facilities = new ArrayList<Facility>();

        String data = System.getProperty("user.dir") + "/data/EthanBogart/data.csv";
        BufferedReader reader;
        String line;

        try {

            reader = new BufferedReader(new FileReader(data));

            line = reader.readLine();
            line = reader.readLine();
            while (line != null) {
                String trimmed = line.replace("\"\"","");
                String[] facilityAttributes = line.split(",");
                Facility facilityObject = new Facility(facilityAttributes);

                facilities.add(facilityObject);

                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
