import java.util.Scanner;

class Practical_3_7{
    int acId; // acId = account Id
    String name;
    double balance;

    public void assignValue(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter account id(ac number should be non zero positive integer) : ");
            acId = scanner.nextInt();
            scanner.nextLine();
        }while(acId <= 0);
        
        System.out.print("Enter name : ");
        name = scanner.nextLine();

        do{
            System.out.print("Enter balance(Balance shouble positive number or zero) : ");
            balance = scanner.nextDouble();
        }while(balance<0);
    }

    public void print(){
        System.out.println("\nAc. ID : " + acId);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }

    public static void find(Practical_3_7[] account, int find){
        int found = 0;
        for(Practical_3_7 a : account){
            if(a.acId == find){
                a.print();
                found++;
            }
        }
        if(found == 0){
            System.out.println("Account doesnn't exists.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Practical_3_7[] account = new Practical_3_7[3];
        for(int i=0 ; i<3; i++){
            System.out.println("Enter details of account " + (i+1) + " : ");
            account[i] = new Practical_3_7();
            account[i].assignValue();
        }

        for(int i=0; i<3; i++){
            System.out.println("\nAccount " + account[i].acId + " details ");
            account[i].print();
        }

        int choice = 0;
        do{
            System.out.println("\nPress 1 to find account.");
            System.out.println("Press 2 to exit");
            choice = scanner.nextInt();
            switch(choice){
                case 1 : System.out.println("Enter account id : ");
                    int find = scanner.nextInt();
                    find(account,find);
                    break;

                case 2 : System.out.println("Exited.");
                    break;

                default : System.out.println("Press 1 or 2 only.");
                    break;
            }
        }while(choice != 2);
    }
}