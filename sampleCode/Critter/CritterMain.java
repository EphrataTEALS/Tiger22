// AP CS A Project 7
// Authors: Stuart Reges and Marty Stepp
//          modified by Kyle Thayer
//
// CritterMain provides the main method for a simple simulation program.  Alter
// the number of each critter added to the simulation if you want to experiment
// with different scenarios.  You can also alter the width and height passed to
// the CritterFrame constructor.

import java.awt.*;

public class CritterMain {
   public static void main(String[] args) {
      CritterFrame frame = new CritterFrame(60, 40);
   
      // add Critters to main here using the form 
      // frame.add(NUMBER_TO_ADD, CLASS_Name.class);
      // frame.add(30, Stone.class);
      // frame.add(30, Mosquito.class);
   
      frame.start();
   }
}
