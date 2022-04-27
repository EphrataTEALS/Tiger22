package sampleCode.WeatherReport;

import java.util.*;

public class Weather {

    public static void main(String[] args) {
        int numStations = getNumStations();
        
        String[] stationCities = getStationCities(numStations);
        
        int numMeasurements = getNumMeasurements();   
        
        int[][] temps = generateTemperatures(numStations, numMeasurements);
        
        System.out.println("Here is the raw temperature data:");
        printRawTemps(stationCities, temps);
        
        System.out.println("The maximum temperature at the second station was");
        System.out.println(getMaxTempAtSecond(temps));
        
        System.out.println("The average temperature measured was");
        System.out.println(getAverageTemp(temps));
        
        System.out.println("The number of stations which started above 50 degrees was");
        System.out.println(getNumStartingAbove50(temps));
    }
    
    public static int getNumStations() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of stations (at least 2): ");
            int num = console.nextInt();
            
            if (num >= 2) {
                return num;
            }
        } 
    }
    
    public static String[] getStationCities(int numStations) {
        String[] cities = new String[numStations];
        Scanner console = new Scanner(System.in);
        
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the name of city " + (i + 1) + ": ");
            cities[i] = console.next();
        }
        
        return cities;
    }
    
    public static int getNumMeasurements() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of temperature measurements from each station (at least 5): ");
            int num = console.nextInt();
            
            if (num >= 5) {
                return num;
            }
        } 
    }
    
    public static int[][] generateTemperatures(int numStations, int numMeasurements) {
        /* 
         * TODO (step 1): Complete this method.
         * You should create a 2D integer array with `numStations` rows and `numMeasurements` columns.
         * You should then fill each element in the 2D array with a random integer between 45 and 65.
         * To get a random number in this range, you can use the expression
         * 
         * r.nextInt(45, 65)
         *
         * This 2D array represents the temperature measurements made at different weather stations.
         * Each row corresponds to one of the stations, and the values in that row are the measurements
         * taken at that station over the course of time.
         */
        Random r = new Random();
        
        return null; // replace this line with your complete code
    }
    
    public static void printRawTemps(String[] stationCities, int[][] temps) {
        /*
         * TODO (step 2): Complete this method.
         * You should print the station name, followed by all the temperatures measured at that station.
         * There should be a single line per station, and the temperatures should be separated by commas.
         * For example, if there were two stations (Ephrata and Seattle), the output could look like
         *
         * Ephrata: 49, 62, 59, 56, 54
         * Seattle: 48, 50, 61, 58, 47
         */
         
        // replace this line with your complete code
    }
    
    public static int getMaxTempAtSecond(int[][] temps) {
        /*
         * TODO (step 3): Complete this method.
         * You should compute and return the largest temperature measurement          
         * that took place at the second (index 1) station.
         */
        
        return 0; // replace this line with your complete code
    }
    
    public static double getAverageTemp(int[][] temps) {
        /*
         * TODO (step 4): Complete this method.
         * You should compute the average temperature value across all measurements.
         */
        
        return 0.0; // replace this line with your complete code
    }
    
    public static int getNumStartingAbove50(int[][] temps) {
        /*
         * TODO (step 5): Complete this method.
         * You should compute and return the number of stations whose first measurement was greater than 50 degrees.
         */
        
        return 0; // replace this line with your complete code
    }
}
