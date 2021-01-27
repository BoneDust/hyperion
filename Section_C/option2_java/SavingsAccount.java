package option2;


class SavingsAccount extends Account{
    
    private double annualInterestRate;

    //Note that the annualInterestRate passed here should be a percentage between 0 - 100 inclusive
    public SavingsAccount(int id, double balance, double annualInterestRate){
        super(id, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getMontlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    //Note that the interest rate needs to be divided by 100 to get the actual value 
    public double getMonthlyInterest(){
        double monthlyInterest  = (getMontlyInterestRate() / 100)  * balance;
        return monthlyInterest;
    }

}