package sampleCode.Inheritance.Vehicle;

public class HybridCar extends Car {
    private double batteryLife;
    private double batteryPerMile;
 
    public void move(int dx, int dy){
      // If the battery is charged use it, otherwise use the fuel (use super.move())
      double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
      double batteryUsed = distance / (5280 * batteryPerMile);
      if (batteryLife - batteryUsed > 0){
        batteryLife -= batteryUsed;
      }
      else{
        super.move(dx, dy);
      }
    }
  }