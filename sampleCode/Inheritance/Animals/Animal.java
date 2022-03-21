package sampleCode.Inheritance.Animals;

public class Animal {
   public int numberOfLegs;
   public String food;
   public double topSpeedMPH;
   public boolean canFly;
   
   public Animal(int nOL, String f, double tSMPH, boolean cF) {
      numberOfLegs = nOL;
      food = f;
      topSpeedMPH = tSMPH;
      canFly = cF;
   }
   
   public void eat() {
      System.out.println("Yum, I just ate some " + food);
   }
   
   public void move() {
      System.out.println("Zoom, I just traveled " + topSpeedMPH + " miles in the last hour!");
   }
   
   public String toString() {
      String flyString = "can";
      if (!canFly) {
         flyString += "not";
      }
      
      return "I have " + numberOfLegs + " legs and can travel " + topSpeedMPH + " miles per hour. "
         + " I eat " + food + " and I " + flyString + " fly.";
   }
}