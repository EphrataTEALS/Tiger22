// package studentWork.ClassesIntro; 
import java.util.ArrayList;


public class PersonClient {

   // TODO (step 0): run the program as is before you've made any changes.
   public static void main(String[] args) {      
      Person jim = new Person();
      jim.name = "Jim";
      jim.age = 27;
      jim.pets = new String[] {"Moby"};
      
      jim.printIntroduction();
      jim.printAge();
      jim.printPetCount();
      jim.haveBirthday();
      jim.printAge();
      
      // TODO (step 1): create a Person instance to represent yourself. Set all the fields with your own data.
      
      
      // TODO (step 2): call the behavior methods of your new Person instance (similar to what was done with the `jim` object);
      
      
      // TODO (step 5): set the value of the field you created in step 3 for both the `jim` object and the Person with your data.
      
      
      // TODO (step 6): call the newly created method you added in step 4 for both the `jim` object and the Person with your data.
      
      
      // TODO (step 7): create an ArrayList called `students` which will hold our class of students
      
      
      // TODO (step 8): populate the `students` ArrayList by adding the `jim` Person object, 
      // the person object representing you, and two more Person objects representing 
      // two of your classmates (ask them for the values each field should have)
      
      
      // TODO (step 10): call the `getYoungestStudent` method that you wrote in step 9. 
      // Save the return value in a variable, then have that object print their introduction and age.
      
   }
   
   // TODO (step 9): write a method `getYoungestStudent` which accepts an ArrayList of Person objects as a parameter.
   // The method should iterate through the ArrayList to find the youngest Person it contains, and it should return that Person.
   // If there are multiple Person objects who are tied for the youngest, the method can return any of them.
   
}