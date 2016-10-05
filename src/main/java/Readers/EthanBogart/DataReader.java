import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Ethan Bogart on 10/5/16.
 */
public class DataReader {
    public ArrayList<String[]> facilities;

    public DataReader() {
        facilities = new ArrayList<String[]>();

        String data = System.getProperty("user.dir") + "/data/EthanBogart/data.csv";
        BufferedReader reader;
        String line;

        try {

            reader = new BufferedReader(new FileReader(data));

            line = reader.readLine();
            while (line != null) {
                String[] facility = line.split(",");
                facilities.add(facility);

                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
