package sampleCode.Inheritance.Lab;

public class Account {

   private int accountNum; 
    
   private String type;

   private double amount;

   public Account(int accountNum, String type, double amount)
   {
      this.accountNum = accountNum;
      this.type = type;
      setAmount(amount);
   }

   public void deposit(double amount)
   {
      this.amount += amount;
   }

   public int getAccoutNum()
   {
      return accountNum;
   }

   public String getType()
   {
      return type;
   }

   public double getAmount()
   {
      return amount;
   }

   public void setAmount(double amount)
   {
      this.amount = amount;
   }
}