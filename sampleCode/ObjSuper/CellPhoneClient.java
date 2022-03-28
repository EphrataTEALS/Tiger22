package sampleCode.ObjSuper;

public class CellPhoneClient {
   public static void main(String[] args) {
      CellPhone[] phones = {
         new IPhone("Alice", 13),
         new CellPhone("Bob", "Samsung Galaxy", 22),
         new IPhone("Charles", 13),
         new IPhone("Darcy", 11),
         new CellPhone("Emma", "Google Pixel", 6),
      };
      
      printAllPhones(phones);
      
      findEqualPhones(phones);
      
      sendTexts(phones);
      
      sendGroupTexts(phones);
      
      sendUnknownNumberTexts(phones);
   }
   
   public static void printAllPhones(CellPhone[] phones) {
      // TODO (Step 1) complete the `CellPhone.toString()` method.
   
      System.out.println("\nHere are the phones:");
      for (CellPhone phone : phones) {
         System.out.println(phone);
      }
   }
   
   public static void findEqualPhones(CellPhone[] phones) {
      // TODO (Step 2) complete the `CellPhone.equals()` method.
   
      System.out.println("\nHere are the pairs of equal phones:");
      for (int i = 0; i < phones.length; i++) {
         for (int j = i + 1; j < phones.length; j++) {
            if (phones[i].equals(phones[j])) {
               System.out.println(phones[i] + " and " + phones[j]);
            }
         }
      }
   }
   
   public static void sendTexts(CellPhone[] phones) {
      // TODO (Step 3) complete the `iPhone.sendText()` method.
            
      System.out.println("\nSending Text Messages:");
      for (int i = 0; i < phones.length; i++) {
         for (int j = 0; j < phones.length; j++) {
            if (i != j) {
               phones[i].sendText(phones[j]);
            }
         }
      }
   }
   
   public static void sendGroupTexts(CellPhone[] phones) {
      /*
       * TODO (Step 4) add the new overloaded version of the `CellPhone.sendText()` method.
       * The method should accept an array of CellPhones as input.
       * It should print a message formatted like the following example:
       *
       *    Jim is sending a text to a group with members:
       *    Emma
       *    Jim
       *    Moby
       */
       
      // un-comment the lines below when you're ready for Step 4
      
      // System.out.println("\nSending Group Text Messages:");
      // for (int i = 0; i < phones.length; i++) {
      //    phones[i].sendText(phones);
      // }
   }
   
   public static void sendUnknownNumberTexts(CellPhone[] phones) {
      /*
       * TODO (Step 5) add the new overloaded version of the `CellPhone.sendText()` method.
       * The method should accept a single string as input, which is assumed to be a cell phone number.
       * It should print a message formatted like the following example:
       *
       *    Jim is sending a text to an unknown number: 800-867-5309
       */
       
      // un-comment the lines below when you're ready for Step 5
      
      // System.out.println("\nSending Unknown Number Text Messages:");
      // for (int i = 0; i < phones.length; i++) {
      //    phones[i].sendText("800-867-5309");
      // }
   }
}