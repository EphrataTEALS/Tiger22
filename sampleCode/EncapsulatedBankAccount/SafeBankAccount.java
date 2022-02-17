// package sampleCode.EncapsulatedBankAccount;


public class SafeBankAccount {
   public int accountNumber = 112358;
   private int balance = 0;
   
   public int withdrawMoney(int requestedAmount) {
      if (requestedAmount < 0) {
         System.out.println("You can't withdraw a negative amount of money.");
         return 0;
      } else if (requestedAmount > balance) {
         System.out.println("You don't have enough money to withdraw $" + requestedAmount);
         return 0;
      }
      
      balance -= requestedAmount;
      return requestedAmount;
   }
   
   public void depositMoney(int depositAmount) {
      if (depositAmount < 0) {
         System.out.println("You can't deposit a negative amount of money.");
         return;
      }
      balance += depositAmount;
   }
   
   public void printAccountInfo() {
      System.out.println("Account #" + accountNumber + ": $" + balance);
   }
}