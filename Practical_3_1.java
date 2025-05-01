import java.util.Scanner;
import java.util.ArrayList;

class Practical_3_1{
    String name;
    Practical_3_1(String name){
        this.name = name;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        ArrayList<Practical_3_1> student = new ArrayList<>();
        do{
            System.out.println("Press 1 to enter name.");
            System.out.println("Press 2 to exit.");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt() told by chatgpt
            switch(choice){
                case 1 : System.out.print("Enter name of student : ");
                    // Practical_3_1[] student = new Practical_3_1[3];
                    student.add(new Practical_3_1(scanner.nextLine())); 
                    break;

                case 2 : System.out.println("\nOutput : ");
                    display(student);
                    break;

                default : System.out.println("Please press 1 or 2 only.");
                    break;
            }
        }while(choice !=2);

    }

    public static void display(ArrayList<Practical_3_1> student){
        int i=1;
        System.out.println("Number of arguments : " + student.size());
        for(Practical_3_1 s : student){
            System.out.println(i++ + " : Student name is = " + s.name);
        }
    }
}