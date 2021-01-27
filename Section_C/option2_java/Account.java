package option2;

import java.util.*;

class Account{
    protected int id;
    protected double balance;
    protected Date dateCreated;

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void withdraw(double withdrawnAmount){
        balance -= withdrawnAmount;
        balance -= withdrawnAmount;
        if (balance < 0){
            balance += withdrawnAmount;
            System.out.println("\nInsufficient funds for withdrawal.");
        }
    }

    public void deposit(double depositedAmount){
        balance += depositedAmount;
    }
}
  