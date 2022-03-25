package sampleCode.Inheritance.Lab;

public class SavingsAccount extends Account
{
   public SavingsAccount(int accountNum, double amount)
   {
      super(accountNum, "savings", amount);
   }
}