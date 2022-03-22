package sampleCode.Inheritance.Vehicle;

class Vehicle {
    static final int FEET_IN_MILE = 5280;
    private int xCord;
    private int yCord;
   
    private double fuelGallons;
    private double maxFuel; 
    private double milePerGallon;
   
    public Vehicle(int xStart, int yStart,  double fuelGallons, double maxFuel, double milePerGallon){
      this.xCord = xStart;
      this.yCord = yStart;
   
      this.fuelGallons = fuelGallons;
      this.maxFuel = maxFuel;
      this.milePerGallon = milePerGallon;
    }
   
    public void move(int dx, int dy){
      // if there is enough fuel, move dx and dy feet.
      double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
      double fuelUsed = distance / (FEET_IN_MILE * milePerGallon); 
      
      if (fuelGallons - fuelUsed > 0){
        this.xCord += dx;
        this.yCord += dy;
        this.fuelGallons -= fuelUsed;
      } else {
        System.out.println("Not enough fuel.");
      }
    }
   
    public void refuel(double fuel){
      this.fuelGallons += fuel;
      if (this.fuelGallons > this.maxFuel){
        this.fuelGallons = this.maxFuel;
      }
    }
   
    public int getX(){
      return xCord;
    }
   
    public int getY(){
      return yCord;
    }
   
    public double getFuel(){
      return fuelGallons;
    }
   
}