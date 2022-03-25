package sampleCode.Inheritance.Lab;

public class CheckingAccount extends Account {
   public CheckingAccount(int accountNum, double amount)
   {
      super(accountNum, "checking", amount);
   }

   public void withdraw(double amount)
   {
      setAmount(getAmount() - amount);
   }
}