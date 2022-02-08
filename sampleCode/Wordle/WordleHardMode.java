import java.util.Scanner;
import java.util.ArrayList;

public class WordleHardMode {
   public static void main(String[] args) {
      playWordleHardGame();
   }
   
   public static void playWordleHardGame() {
      // Plays a game of wordle (see https://www.powerlanguage.co.uk/wordle/)
      
      System.out.println("There are " + WordLists.TARGETS.size() + " possible targets");
      
      String target = getRandomTarget();
      
      ArrayList<Character> grayLetters = new ArrayList<Character>();
      
      for (int i = 1; i <= 6; i++) {
         System.out.println("\nGuess " + i);
         
         System.out.print("Your current gray letters are: ");
         printGrayLetters(grayLetters);
         
         String guess = getGuess(grayLetters);
         System.out.println("You guessed " + guess);
         
         // TODO (Step 1): change the if condition below to check if the guess was correct
         if (false) {
            System.out.println("You found the target word in " + i + " guesses!");
            return;
         } else {
            System.out.println("That was not the target word.");
            printGuessFeedback(guess, target, grayLetters);
         }
      }
      
      System.out.println("You ran out of guesses. The target word was " + target);
   }
   
   public static String getRandomTarget() {
      /*
       * TODO (Step 2): implement this method which should return 
       * a random word from the ArrayList WordLists.TARGETS.
       * You can do this by creating a random index between 0 and
       * WordLists.TARGETS.size() - 1 (inclusive) and returning
       * the word stored at that index.
       */
      return "arrow";
   }
   
   public static void printGrayLetters(ArrayList<Character> grayLetters) {
      /*
       * TODO (Step 3): implement this method to print out the list of characters
       * that guesses are not allowed to use.
       */
   }
   
   public static String getGuess(ArrayList<Character> grayLetters) {
      /*
       * This method which should return a valid guess entered by the user.
       * A valid guess is a real word which is 5 letters long that does not use any gray letters.
       */
      Scanner console = new Scanner(System.in);
      
      while (true) {
         System.out.print("Your guess: ");
         String guess = console.nextLine().toLowerCase();
         
         // TODO (Step 4): change the if condition below to check if the guess is the right length
         if (false) {
            System.out.println("Your guess must have 5 letters");
         } else if (!isRealWord(guess)) {
            System.out.println("You must enter a real word as your guess");
         } else if (usesGrayLetter(guess, grayLetters)) {
            System.out.println("Your guess cannot contain any gray letters");
         } else {
            return guess;
         }
      }
   }
   
   public static boolean isRealWord(String guess) {
      /*
       * TODO (Step 6): implement this method, which checks to make sure
       * the user's guess is a real word.
       * A real word is one that is present in the WordLists.WORDS ArrayList.
       * You should implement a search algorithm to check if the guess is contained
       * in the list. If it helps, you can use the knowledge that the list is in sorted order.
       */
      return true;
   }
   
   public static boolean usesGrayLetter(String guess, ArrayList<Character> grayLetters) {
      /*
       * TODO (Step 7): implement this method which checks to make sure that the guess does not
       * contain any of the letters from the grayLetters list.
       * You can implement this method by looping over the letters in the guess and checking
       * to make sure it is not in the grayLetters list.
       */
      return false;
   }
   
   public static void printGuessFeedback(String guess, String target, ArrayList<Character> grayLetters) {
      /*
       * TODO (Step 5): implement this method which should print out feedback about the user's guess,
       * as well as update the grayLetters list with any newly found gray letters.
       *
       * Loop over each letter in the guess.
       *     - if the letter matches the letter in the same position in the target, print "green"
       *     - if the letter is not in the target at all, print "gray" and add the letter to the grayLetters list
       *     - otherwise, the guessed letter is in the wrong position, so print "yellow"
       *
       * Example: the method call printGuessFeedback("first", "split", new ArrayList<Character>()) would print
       *     Your guess feedback is
       *     f: gray
       *     i: yellow
       *     r: gray
       *     s: yellow
       *     t: green
       * and the grayLetters ArrayList would contain the letters 'f' and 'r'.
       */
      System.out.println("Your guess feedback is");
   }
}