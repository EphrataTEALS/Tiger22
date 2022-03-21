package sampleCode.Inheritance.Animals;

public class Bird extends Animal {
   public Bird(String f, double tSMPH) {
      super(2, f, tSMPH, true);
   }
   
   public void move() {
      System.out.println("Whoosh, I just flew " + topSpeedMPH + " miles in the last hour.");
   }
}