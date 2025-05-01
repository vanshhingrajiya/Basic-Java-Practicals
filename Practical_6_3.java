import java.util.Scanner;
import java.util.ArrayList;

class BankAccount{
    String acHolderName; // acHolderName = account holder name
    int acNum ; // acNum = account number
    public static int uniqueNum = 1000; // this is for assigning unique and new account number to new user

    BankAccount(String acHolderName, int acNum){
        this.acHolderName = acHolderName;
        this.acNum = acNum;
    }

}

class SavingAccount extends BankAccount{
    double balance;
    double interestRate;
    SavingAccount(String acHolderName,int acNum){
        super(acHolderName,acNum);
        this.balance = 0;
        this.interestRate = 0.03; //3%
    }
    
    public void calculateInt(){
        System.out.println("Interest earned from saving account : " + balance*interestRate);
    }
}

class FixedDeposite extends BankAccount{
    double interestRate;
    double balance = 0;
    int duration; // duration in days

    FixedDeposite(String acHolderName,int acNum, double amt, int duration){
        super(acHolderName, acNum);
        this.balance = this.balance + amt;
        this.duration = duration;
        this.interestRate = 0.075; // 7.5%
    }

    public void calculateInt(){
        System.out.println("Interest earned from saving account : " + balance*interestRate);
    }
}

class Practical_6_3{

    public static void openAccount(ArrayList<SavingAccount> account,Scanner scanner){
        System.out.print("Enter your name.");
        BankAccount.uniqueNum++;
        String name = scanner.nextLine();
        name = scanner.nextLine();
        account.add(new SavingAccount(name,BankAccount.uniqueNum));
        for(SavingAccount b : account){
            if(b.acNum == BankAccount.uniqueNum){
                System.out.println("\nCongratulations Account opened.Account details are below.");
                System.out.println("Account number : " + b.acNum);
                System.out.println("Account holder name : " + b.acHolderName);
                System.out.println("Current balance : " + b.balance);
                System.out.println("Note*** Remeber your account number.");
            }
        }
    }

    public static void deposite(ArrayList<SavingAccount> account,Scanner scanner){
        System.out.print("Enter account number : ");
        int temp = scanner.nextInt();
        int isFound = 0; // isFound to check whether account is found or not
        for(SavingAccount b : account){
            if(b.acNum == temp){
                System.out.print("Enter amount you want to deposite : ");
                int depo = scanner.nextInt();
                b.balance += depo;
                System.out.println("Amount deposited.");
                System.out.println("New balance : " + b.balance);
                isFound++;
                break;
            }
        }
        if(isFound == 0){
            System.out.println("Account doesn't exists.");
        }
    }

    public static void checkBalance(ArrayList<SavingAccount> account,ArrayList<FixedDeposite> fd, Scanner scanner){
        System.out.print("Enter account number : ");
        int temp = scanner.nextInt();
        int isFoundSave = 0; // isFound to check whether account is found or not
        int isFoundFix = 0; // isFound to check whether account is found or not
        for(SavingAccount b : account){
            if(b.acNum == temp){
                System.out.println("Current balance : " + b.balance);
                for(FixedDeposite f : fd){
                    if(b.acNum == f.acNum){
                        System.out.println("Fixed deposite balance : " + f.balance);
                        isFoundFix++;
                    }
                }
                isFoundSave++;
                break;
            }
        }
        if(isFoundSave == 0){
            System.out.println("Account doesn't exists.");
        }
        if(isFoundFix == 0){
            System.out.println("No fixes deposites.");
        }
    }

    public static void withdraw(ArrayList<SavingAccount> account,Scanner scanner){
        System.out.print("Enter account number : ");
        int temp = scanner.nextInt();
        int isFound = 0; // isFound to check whether account is found or not
        for(SavingAccount b : account){
            if(b.acNum == temp){
                System.out.print("Enter amount you want to withdraw : ");
                double with = scanner.nextInt();
                // if(with<0){
                //     System.out.println("Please enter positive amount.");
                //     isFound++;
                // }
                try{
                    isSufficient(with,b.balance);
                    b.balance -= with;
                    System.out.println("Amount withdrawed.");
                    System.out.println("New balance : " + b.balance);
                }
                catch(InSufficientBalanceException e){
                    System.out.println(e.getMessage());
                }               
                    isFound++;
                    break;
            }
        }
        if(isFound == 0){
            System.out.println("Account doesn't exists.");
        }
    }

    public static void isSufficient(double with, double balance) throws InSufficientBalanceException{
        if(with > balance){
            throw new InSufficientBalanceException();
        }
    }

    public static void calInterest(ArrayList<SavingAccount> account,ArrayList<FixedDeposite> fd,Scanner scanner){
        System.out.print("Enter account number : ");
        int temp = scanner.nextInt();
        int isFoundSave = 0; // isFound to check whether account is found or not
        int isFoundFix = 0; // isFound to check whether account is found or not
        for(SavingAccount b : account){
            if(b.acNum == temp){
                b.calculateInt();
                isFoundSave++;
                break;
            }
        }
        for(FixedDeposite f : fd){
            if(f.acNum == temp){
                f.calculateInt();
                isFoundFix++;
                break;
            }
        }
        if(isFoundSave == 0){
            System.out.println("Saving account doesn't exists.");
        }
        if(isFoundFix == 0){
            System.out.println("Fix deposite account doesn't exists.");
        }
    }

    public static void openFd(ArrayList<SavingAccount> account, ArrayList<FixedDeposite> fd, Scanner scanner){
        System.out.print("Enter your account number : ");
         int temp = scanner.nextInt();
        int isFound = 0; // isFound to check whether account is found or not
        for(SavingAccount b : account){
            if(b.acNum == temp){
                System.out.println("Enter amount of which you want to make fix deposite : ");
                int amt = scanner.nextInt();
                System.out.println("Enter tenure of fixed deposite(Note** Minimum 365 days) : ");
                int tenure = scanner.nextInt();
                if(amt <= 0){
                    System.out.println("Please enter positive amount.");
                    isFound++;
                }
                else if(tenure < 365){
                    System.out.println("Please enter tenure of 365 days or more.");
                    isFound++;
                }
                else{
                    if(amt <= b.balance){
                        fd.add(new FixedDeposite(b.acHolderName,b.acNum,amt,tenure));
                        b.balance -= amt;
                    }
                    else{
                        System.out.println("Insufficient balance in account.");
                    }
                    isFound++;
                    break;
                }
            }
        }
        if(isFound == 0){
            System.out.println("Account doesn't exists.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<SavingAccount> account = new ArrayList<>();
        ArrayList<FixedDeposite> fd = new ArrayList<>();
        int choice; 
        do{
            System.out.println("\nPress 1 to open account.");
            System.out.println("Press 2 to deposite.");
            System.out.println("Press 3 to check balance.");
            System.out.println("Press 4 to withdraw.");
            System.out.println("Press 5 to calculate interest rate.");
            System.out.println("Press 6 to make fix deposite.");
            System.out.println("Press 7 to exit.");
            choice = scanner.nextInt();
            switch(choice){
                case 1 : openAccount(account,scanner);
                    break;

                case 2 : deposite(account,scanner);
                    break;

                case 3 : checkBalance(account,fd,scanner);
                    break;

                case 4 : withdraw(account,scanner);
                    break;

                case 5 : calInterest(account,fd,scanner); // calInterest to calculate interest rate
                    break;

                case 6 : openFd(account,fd,scanner);
                    break;

                case 7 : 
                    break;
                
                default : System.out.println("Enter number between 1-7 only.");
                    break;
            }
        }while(choice != 7);
    }
}

class InSufficientBalanceException extends Exception{
    public InSufficientBalanceException(){
        super("Insufficient balance.");
    }
}