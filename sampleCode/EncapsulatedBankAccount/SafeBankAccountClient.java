// package sampleCode.EncapsulatedBankAccount;


public class SafeBankAccountClient {
   public static void main(String[] args) {
      // create a new account
      SafeBankAccount myAccount = new SafeBankAccount();
      myAccount.printAccountInfo();
            
      // make an initial deposit
      // System.out.println("\nDepositing $100");
      // myAccount.depositMoney(100);
      // myAccount.printAccountInfo();
      
      // withdraw money
      // System.out.println("\nTrying to withdraw $30");
      // int amountWithdrawn = myAccount.withdrawMoney(30);
      // System.out.println("I got $" + amountWithdrawn + " out of the account");
      // myAccount.printAccountInfo();
      
      // try to withdraw more than you have
      // System.out.println("\nTrying to withdraw $300");
      // amountWithdrawn = myAccount.withdrawMoney(300);
      // System.out.println("I got $" + amountWithdrawn + " out of the account");
      // myAccount.printAccountInfo();
      
      // maliciously withdraw more than we should be allowed to.
      // System.out.println("\nHahahaha, you can't stop me from withdrawing $300");
      // myAccount.balance -= 300;
      // myAccount.printAccountInfo();
   }
}