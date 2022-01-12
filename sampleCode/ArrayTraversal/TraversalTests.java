
public class TraversalTests {
   public static void main(String[] args) {
      boolean part1 = false;
      boolean part2 = false;
      boolean part3 = false;
      boolean part4 = false;
      
      if (part1) {
         runPart1(); // put your code in the printArray() method
      }

      if (part2) {
         runPart2(); // put your code in the areArraysEqual() method
      }
      
      if (part3) {
         runPart3(); // put your code in the searchAndReplace() method
      }
      
      if (part4) {
         runPart4(); // put your code in the reverseArray() method
      }
   }
   
   public static void printArray(int[] arr) {
      /*
       * This method should print the contents of an array on a single line. 
       * It should work for arrays with no elements, one element, or more than one element.
       *
       * Here are some formatting examples:
       *    - if the array has no elements, it should print "[]"
       *    - if the array had a single element 1, it should print "[1]"
       *    - if the array had three elements 1, 23, and 456, it should print "[1, 23, 456]"
       */
       
      // Your code goes below this line (suggested length: ~10 lines)
      System.out.println(arr);      
   }
   
   public static boolean areArraysEqual(int[] arr1, int[] arr2) {
      /*
       * This method should return true if the two 
       * input arrays, arr1 and arr2, are equal.
       * First, think about what it means for two arrays to be equal.
       * There are two requirements:
       *    1) 
       *    2) 
       * Then, think about which is easier to verify:
       *    - two arrays are equal
       *    - two arrays are *not* equal
       */
       
      // Your code goes below this line (suggested length: ~10 lines)
      return false;
      
   }
   
   public static int[] findAndReplace(int[] arr, int findValue, int replaceValue) {
      /*
       * This method loops over the input array and overwrites 
       * every occurrence of the findValue with the replaceValue.
       * The array that is returned should have no more occurrences of the findValue in it.
       */
       
      // Your code goes below this line (suggested length: ~6 lines)
      return arr;
   }
   
   public static int[] reverseArray(int[] arr) {
      /*
       * This method should reverse the order of elements in the arr.
       * Note that there are two ways you could do this:
       *    1) Create a new array that you can copy the reversed elements into.
       *    2) Swap pairs of elements in the original array without creating a new array.
       *       That is, swap the first element with the last element,
       *       the second element with the second-to-last element, etc.
       * I would suggest first implementing 1), and then working on 2) if you have more time.
       *
       * Question to think about: why might 2) be a better solution that 1)?  
       */
       
      // Your code goes below this line (suggested length: ~5 lines)
      return arr;
   }
   
   /*************************************************************************/
   /*                                                                       */
   /*                                                                       */
   /*                                                                       */
   /*                                                                       */
   /*                 DON'T CHANGE ANYTHING BELOW THIS BOX                  */
   /*                                                                       */
   /*                                                                       */
   /*                                                                       */
   /*                                                                       */
   /*************************************************************************/
   
   public static void runPart1() {
      System.out.println("Part 1: printArray()");
      int[] arr1 = new int[0];
      System.out.println("The array is [] and your method printed");
      printArray(arr1);
      
      int[] arr2 = {1};
      System.out.println("\n\nThe array is [1] and your method printed");
      printArray(arr2);
      
      int[] arr3 = {1, 23, 456};
      System.out.println("\n\nThe array is [1, 23, 456] and your method printed");
      printArray(arr3);
   }
   
   public static void runPart2() {
      System.out.println("\n\nPart 2: areArraysEqual()");
      int[] arr1 = {1, 23, 456};
      int[] arr2 = {0, 22, 455};
      int[] arr3 = {123, 456};
      int[] arr4 = {1, 23, 456};
      
      System.out.println("The arrays");
      printArray(arr1);
      System.out.println("and");
      printArray(arr2);
      System.out.println("are equal? " + areArraysEqual(arr1, arr2));
      
      System.out.println("\n\nThe arrays");
      printArray(arr1);
      System.out.println("and");
      printArray(arr3);
      System.out.println("are equal? " + areArraysEqual(arr1, arr3));
      
      System.out.println("\n\nThe arrays");
      printArray(arr1);
      System.out.println("and");
      printArray(arr4);
      System.out.println("are equal? " + areArraysEqual(arr1, arr4));
   }
   
   public static void runPart3() {
      System.out.println("\n\nPart 3: findAndReplace()");
      int[] arr1 = {1, 2, 3, 4, 1, 2, 0, 8, 1};
      System.out.println("The array is originally");
      printArray(arr1);
      int findValue = 1;
      int replaceValue = 55;
      System.out.println("After replacing all the " + findValue + "s with " + replaceValue + "s, the array is");
      printArray(findAndReplace(arr1, findValue, replaceValue));
      
      int[] arr2 = {1, 2, 3, 5, 6, 7, 8};
      System.out.println("\n\nThe array is originally");
      printArray(arr2);
      findValue = 4;
      replaceValue = 99;
      System.out.println("After replacing all the " + findValue + "s with " + replaceValue + "s, the array is");
      printArray(findAndReplace(arr2, findValue, replaceValue));
      
      int[] arr3 = {2, 2, 2, 2};
      System.out.println("\n\nThe array is originally");
      printArray(arr3);
      findValue = 2;
      replaceValue = 88;
      System.out.println("After replacing all the " + findValue + "s with " + replaceValue + "s, the array is");
      printArray(findAndReplace(arr3, findValue, replaceValue));
   }
   
   public static void runPart4() {
      System.out.println("\n\nPart 4: reverseArray()");
      int[] arr1 = {1, 2, 3, 4, 5};
      System.out.println("The array is originally");
      printArray(arr1);
      System.out.println("After reversing, the array is");
      printArray(reverseArray(arr1));
      
      int[] arr2 = {123};
      System.out.println("The array is originally");
      printArray(arr2);
      System.out.println("After reversing, the array is");
      printArray(reverseArray(arr2));
      
      int[] arr3 = new int[0];
      System.out.println("The array is originally");
      printArray(arr3);
      System.out.println("After reversing, the array is");
      printArray(reverseArray(arr3));
   }
}
