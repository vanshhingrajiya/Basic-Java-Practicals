import java.util.Scanner;
import java.util.ArrayList;

class Practical_3_4{
    private String name;
    private double salary;
    Practical_3_4(){
        this.name = "";
        this.salary = -1;
    }

    public void getData(Scanner scanner){
        System.out.print("\nEnter name of employee :");
        this.name =  scanner.nextLine();
        System.out.print("Enter salary of employee :");
        this.salary =  scanner.nextDouble();
    }

    public void putData(){
        System.out.println("Name of employee : " + this.name);
        System.out.println(this.name + "'s salary : " + this.salary + "\n");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Practical_3_4> employee = new ArrayList<>();
        int choice = 0;
        do{
            System.out.println("\nPress 1 to add emoloyee.");
            System.out.println("Press 2 to exit.");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 : Practical_3_4 emp = new Practical_3_4();
                    emp.getData(scanner);
                    employee.add(emp);
                    break;

                case 2 : 
                    break;
                    
                default : System.out.println("\nPlease press 1 or 2 only.");
                    break;
            }
        }while(choice != 2);

        System.out.println("\nEmployees detail");
        for(Practical_3_4 e : employee){
            e.putData();
        }
    }
}