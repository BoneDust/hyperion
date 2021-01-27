package option2;

class CheckingAccount extends Account{
   //this is a percentage so it should be divided by 100
   private double overdraft;


   public CheckingAccount(int id, double balance, double overdraft){
       super(id, balance);
       this.overdraft = overdraft;
   }

   
   public double getOverdraft(){
       return overdraft;
   }

   @Override
   public void withdraw(double withdrawnAmount){
    balance -= withdrawnAmount;
    if (balance < overdraft * -1){
        balance += withdrawnAmount;
        System.out.println("\nInsufficient funds for withdrawal.");
    }
}

}