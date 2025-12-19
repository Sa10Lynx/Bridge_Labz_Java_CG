package Core_Programming.Programming_Elements.L01;

public class VolumeOfEarth {
    public static void main(String[] args){
        int radiusInKilometers=6378;
        double radiusInMiles=(radiusInKilometers)*1.6;

        double volumeInKilometers=Math.pow(radiusInKilometers,3)*(4.0/3.0)*(3.14);
        double volumeInMiles=Math.pow(radiusInMiles,3)*(4.0/3.0)*(3.14);

        System.out.println("The volume of earth in cubic kilometers is "+volumeInMiles+
                " the volume of earth in cubic miles "+volumeInMiles);
    }
}
