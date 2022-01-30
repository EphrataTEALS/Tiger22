import java.util.Scanner;

public class Wordle {
   public static void main(String[] args) {
      playWordleGame();
   }
   
   public static void playWordleGame() {
      // Plays a game of wordle (see https://www.powerlanguage.co.uk/wordle/)
      
      System.out.println("There are " + WordLists.TARGETS.size() + " possible targets");
      
      String target = getRandomTarget();
      
      for (int i = 1; i <= 6; i++) {
         System.out.println("\nGuess " + i);
         
         String guess = getGuess();
         System.out.println("You guessed " + guess);
         
         // TODO (Step 1): change the if condition below to check if the guess was correct
         if (false) {
            System.out.println("You found the target word in " + i + " guesses!");
            return;
         } else {
            System.out.println("That was not the target word.");
            printGuessFeedback(guess, target);
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
   
   public static String getGuess() {
      /*
       * This method which should return a valid guess entered by the user.
       * A valid guess is a real word which is 5 letters long.
       */
      Scanner console = new Scanner(System.in);
      
      while (true) {
         System.out.print("Your guess: ");
         String guess = console.nextLine().toLowerCase();
         
         // TODO (Step 3): change the if condition below to check if the guess is the right length
         if (false) {
            System.out.println("Your guess must have 5 letters");
         } else if (!isRealWord(guess)) {
            System.out.println("You must enter a real word as your guess");
         } else {
            return guess;
         }
      }
   }
   
   public static boolean isRealWord(String guess) {
      /*
       * TODO (Step 5): implement this method, which checks to make sure
       * the user's guess is a real word.
       * A real word is one that is present in the WordLists.WORDS ArrayList.
       * You should implement a search algorithm to check if the guess is contained
       * in the list. If it helps, you can use the knowledge that the list is in sorted order.
       */
      return true;
   }
   
   public static void printGuessFeedback(String guess, String target) {
      /*
       * TODO (Step 4): implement this method which should 
       * print out feedback about the user's guess.
       * Loop over each letter in the guess.
       *     - if the letter matches the letter in the same position in the target, print "green"
       *     - if the letter is not in the target at all, print "gray"
       *     - otherwise, the guessed letter is in the wrong position, so print "yellow"
       *
       * Example: the method call printGuessFeedback("first", "split") would print
       *     Your guess feedback is
       *     f: gray
       *     i: yellow
       *     r: gray
       *     s: yellow
       *     t: green
       */
      System.out.println("Your guess feedback is");
   }
}