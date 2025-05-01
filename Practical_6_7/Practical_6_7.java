import exam.Result;
import java.util.Scanner;

class Practical_6_7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student registration number : ");
        int regNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student name : ");
        String name = scanner.nextLine();
        System.out.println("Enter marks in subject 1 : ");
        int marks1 = scanner.nextInt();
        System.out.println("Enter marks in subject 2 : ");
        int marks2 = scanner.nextInt();
        System.out.println("Enter marks in subject 3 : ");
        int marks3 = scanner.nextInt();

        Result studentResult = new Result(regNo,name,marks1,marks2,marks3);
        studentResult.generateMarkSheet();
    }
}