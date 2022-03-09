import java.util.Scanner;
import java.util.ArrayList;

class ElevensConsoleRunner {
   public static void main(String[] args) {
      playGame();
   }
   
   public static void playGame() {
      ElevensBoard board = new ElevensBoard();
      
      Scanner scan = new Scanner(System.in);
      
      while(board.anotherPlayIsPossible() && !board.gameIsWon()) {
         step(scan, board);
      }
      
		if (board.isEmpty()) {
			System.out.println("Congrats, you won!");
		} else if (!board.anotherPlayIsPossible()) {
			System.out.println("Sorry, you lost!");
		}
   }
   
   public static void step(Scanner scan, ElevensBoard board) {
      System.out.println("Current board:");
      System.out.println(board);
      
      System.out.println("Enter your card indices (Ex: 0,4): ");
      String input = scan.nextLine();
      
      ArrayList<Integer> selection = new ArrayList<Integer>();
      for (int i = 0; i < input.length(); i += 2) {
         selection.add(Integer.parseInt(input.substring(i, i+1)));
      }
      
      if (!board.isLegal(selection)) {
         System.out.println("That was not a legal selection");
			return;
		} else {
			// Do the replace.
			board.replaceSelectedCards(selection);
      }
   }
}