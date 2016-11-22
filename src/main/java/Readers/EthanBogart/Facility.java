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
    public double daysSinceInspection;
    public String complianceStatus;
    public double TRIReleases;


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
        //this.id = Integer.parseInt(features[0].replace("\"",""));
        this.name = features[2];
        this.latitude = Double.parseDouble(features[3]);
        this.longitude = Double.parseDouble(features[4]);
        this.percentMinority = Double.parseDouble(features[5]);
        this.populationDensity = Double.parseDouble(features[6]);
        this.daysSinceInspection = Double.parseDouble(features[7]);
        this.complianceStatus = features[8];
        this.TRIReleases = Double.parseDouble(features[10]);
    }
}
