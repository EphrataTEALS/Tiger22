package sampleCode.Inheritance.Animals;

public class AnimalClient {
   public static void main(String[] args) {
      Animal[] zoo = {new Animal(0, "plants", 0.03, false), new Fish(), new Bird("insects", 100.0), new Falcon(), new Goose()};
      
      for (int i = 0; i < zoo.length; i++) {
         System.out.println(zoo[i]);
         zoo[i].move();
         zoo[i].eat();
         System.out.println();
      }
   }
}