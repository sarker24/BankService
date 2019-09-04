package bankaccountservice;


public class Account {
    private int accountNumber;
    private double balance;
    
    
    public Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposite(double amount)
    {
        balance = balance + amount;
    }
            
    public void withdraw(double amount)
    {
        balance = balance-amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
}