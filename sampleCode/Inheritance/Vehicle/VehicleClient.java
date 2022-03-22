package sampleCode.Inheritance.Vehicle;

public class VehicleClient {
   public static void main(String[] args) {
      Vehicle[] travel = {new Vehicle(0, 5, 6.0, 36.0, 24.0)};
      
      for (int i = 0; i < travel.length; i++) {
         System.out.println(travel[i]);
         travel[i].getX();
         travel[i].getY();
         travel[i].getFuel();
         System.out.println();
      }
   }
}