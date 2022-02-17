package sampleCode.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CheckList {

   public static void main(String[] args) {
    
      //Initialize the ArrayList
      ArrayList <String> checkList = new ArrayList<String>();
      
      System.out.println("Enter items you would like to add to the Checklist");
      
      Scanner inputScanner = new Scanner(System.in);
      String inputLine = inputScanner.nextLine();
      checkList.add(inputLine);
        
        while (!inputLine.equals("quit"))
        {
            System.out.println(checkList);
            inputLine = inputScanner.nextLine();
            checkList.add(inputLine);
            
            /* Show list before and after Sorting of arraylist using Collections.sort*/

            /*if (inputLine.equals("quit")) {
                checkList.remove("quit");
            }*/
            System.out.println("Before sort, items = " + checkList);
            Collections.sort(checkList);
            System.out.println("After sort, items = " + checkList);

            // What parameters do you need to pass?
            sortCheckList(checkList);
        }
    }

      
      
    //Sort the Checklist items
      
   public static void sortCheckList (ArrayList<String> list) {
      
	   /* Write a for loop or for each loop that prints the sorted list with one item per row  */
	   
       /*System.out.println();
       System.out.println("ForEachPrintOut");
       System.out.println("- - - - - - - -");
       Collections.sort(list);  // Sort cars
            for (String i : list) {
                System.out.println(i);
        }

        System.out.println();
        System.out.println("ForLoopPrintOut");
        System.out.println("- - - - - - - -");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
          }*/
   }   
}