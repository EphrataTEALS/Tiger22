package sampleCode.Inheritance.Lab;

public class CdAccount extends Account{

    private int months;

    public CdAccount(int accountNum, double amount)
    {
       super(accountNum, "certificate of deposit", amount);
    }
 
    public void term(int months)
    {
       this.months = months;
    }

    public int getTerm()
    {
       return months;
    }

}

