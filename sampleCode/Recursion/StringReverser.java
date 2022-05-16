import java.util.*;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String reversed = reverse("Hello World", "", scan);
        System.out.println(reversed);
    }
    
    public static String reverse(String inputString, String indent, Scanner scan) {
        System.out.println(indent + "in method call reverse(" + inputString + ")");
        scan.nextLine();
        if (inputString.equals("")) {
            System.out.println(indent + "found the base case!");
            scan.nextLine();
            return inputString;
        }
        
        char firstChar = inputString.charAt(0);
        
        String rest = inputString.substring(1);
        
        System.out.println(indent + "when reversing " + inputString + ", the first character is " + firstChar + " and the rest of the string is " + rest);
        scan.nextLine();
        
        String reversedRest = reverse(rest, indent + "  ", scan);
        
        System.out.println(indent + "when reversing " + inputString + ", the reversed rest of the string is " + reversedRest);
        scan.nextLine();
        
        String result = reversedRest + firstChar;
        
        System.out.println(indent + "the reversed version of " + inputString + " is " + result);
        scan.nextLine();
        
        return result;
    }
}