package sampleCode.Inheritance.Animals;

public class Fish extends Animal {
   public Fish() {
      super(0, "kelp", 70.0, false);
   }
   
   public void move() {
      System.out.println("Blub, I just swam " + topSpeedMPH + " miles in the last hour.");
   }
}
