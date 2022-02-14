// package studentWork.ClassesIntro; 

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
      
      // TODO (step 1): create a person instance to represent yourself. Set all the fields with your own data.
      
      // TODO (step 2): call the behavior methods of your new Person instance (similar to what was done with the `jim` variable);
      
      // TODO (step 5): set the value of the field you created in step 3 for both the `jim` variable and the Person with your data.
      
      // TODO (step 6): call the newly created method you added in step 4 for both the `jim` variable and the Person with your data.
   }
}