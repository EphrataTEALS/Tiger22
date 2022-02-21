package sampleCode.Constructor.This;

public class AccountClient {

    public static void main(String[] args) {

        Account darwin = new Account();
        darwin.getAccount();

        Account kari = new Account(2,"Kari Schweitzer");
        kari.getAccount();
        
    }

}