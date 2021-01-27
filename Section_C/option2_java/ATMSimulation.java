package option2;

import java.util.*;

class ATMSimulation{

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        final String RED_TEXT = "\u001B[31m"; 
        final String WHITE_TEXT = "\u001B[0m"; 
        List<Account> accounts = new ArrayList<>();
        //Creating checking accounts
        accounts.add(new CheckingAccount(1, 25000.00, 1000.0));
        accounts.add(new CheckingAccount(2, 18000.00, 500.0));
        accounts.add(new CheckingAccount(3, 6000.00, 100.0));
        accounts.add(new CheckingAccount(4, 23000.00, 1000.0));
        accounts.add(new CheckingAccount(5, 32050.00, 1000.0));
        
        //Creating savings accounts
        accounts.add(new SavingsAccount(6, 38000.00, 4.6));
        accounts.add(new SavingsAccount(7, 55000.00, 6.1));
        accounts.add(new SavingsAccount(8, 6600.00, 8.0));
        accounts.add(new SavingsAccount(9, 27800.00, 5.5));
        accounts.add(new SavingsAccount(10, 6000000.00, 9.5));
        
        
        while (true) {
            System.out.print("Please enter unique account id: ");
            try {
                int id = userInput.nextInt();
                if (id > 10 || id <= 0)
                    System.out.print(RED_TEXT + "Account relating to the entered id does not exist.\n" + WHITE_TEXT);
                else {
                    Account selectAccount = accounts.get(id - 1);
                    administerAccount(selectAccount);
                }
            }
            catch (InputMismatchException ex) {
                System.out.print(RED_TEXT + "Please ensure an integer is entered.\n" + WHITE_TEXT);
                userInput.next();
            }
        
        }
    }

    private static void displayMenu(){
        System.out.print("\nMain menu\n1. check the balance\n2. withdraw\n3. deposit\n4. exit\n");
    }

    private static void administerAccount(Account account){
        int menuChoice;
        do {
            displayMenu();
            menuChoice = userInput.nextInt();
            switch(menuChoice){
                case 1:
                    System.out.println("\nAccount balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("\nEnter amount to be withdrawn: ");
                    double withdrawnAmount = userInput.nextDouble();
                    account.withdraw(withdrawnAmount);
                    break;
                case 3:
                    System.out.print("\nEnter amount to be deposited: ");
                    double depositAmount = userInput.nextDouble();
                    account.deposit(depositAmount);
                    break;
                default:
                    break;
            }
        }
        while(menuChoice != 4);
        
    }
}