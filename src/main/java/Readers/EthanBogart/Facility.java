package Readers.EthanBogart;

import java.util.ArrayList;

/**
 * Created by ethan on 10/28/16.
 */
public class Facility {
    public int id;
    public String name;
    public double latitude;
    public double longitude;
    public double percentMinority;
    public double populationDensity;
    public int daysSinceInspection;
    public String complianceStatus;
    public int TRIReleases;


    public Facility (int id, String name, double latitude, double longitude, double percentMinority,
                    double populationDensity, int daysSinceInspection, String complianceStatus,
                    int TRIReleases) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.percentMinority = percentMinority;
        this.populationDensity = populationDensity;
        this.daysSinceInspection = daysSinceInspection;
        this.complianceStatus = complianceStatus;
        this.TRIReleases = TRIReleases;
    }

    public Facility (String[] features) {
        this.id = Integer.parseInt(features[0]);
        this.name = features[1];
        this.latitude = Double.parseDouble(features[2]);
        this.longitude = Double.parseDouble(features[3]);
        this.percentMinority = Double.parseDouble(features[4]);
        this.populationDensity = Double.parseDouble(features[5]);
        this.daysSinceInspection = Integer.parseInt(features[6]);
        this.complianceStatus = features[7];
        this.TRIReleases = Integer.parseInt(features[9]);
    }
}
