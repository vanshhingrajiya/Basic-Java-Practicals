package exam;
import student.Student;

public class Result extends Student{
    int marks1,marks2,marks3;

    public Result(int regNo, String name, int marks1, int marks2, int marks3){
        super(regNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void generateMarkSheet(){
        int total = marks1 + marks2 + marks3;
        double percentage = total/3.0;

        System.out.println("Marks in subject 1 : " + marks1);
        System.out.println("Marks in subject 2 : " + marks2);
        System.out.println("Marks in subject 3 : " + marks3);
        System.out.println("total marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
        if(percentage >= 33){
            System.out.println("Student " + regNo + " has passed exam.");
        } else{
            System.out.println("Student " + regNo + " has failed exam.");
        }
    }
}
