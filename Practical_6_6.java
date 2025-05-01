import java.util.Scanner;

class Practical_6_6{
    int marks;
    int regNo;
    Practical_6_6(){
        marks = -1;
        regNo = -1;
    }

    Practical_6_6(int marks, int regNo){
        this.marks = marks;
        this.regNo = regNo;
    }

    public void isPass() throws NegativeMarksException{
        if(marks<0){
            throw new NegativeMarksException();
        }
        if(marks > 40){
            System.out.println("Student " + regNo + " has passed exam.");
        }
        else{
            System.out.println("Student " + regNo + " has failed exam.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter regNo : ");
        int regNo = scanner.nextInt();
        System.out.println("Enter Marks : ");
        int marks = scanner.nextInt();
        Practical_6_6 m = new Practical_6_6(marks,regNo);
        try{
            m.isPass();
        } catch(NegativeMarksException e){
            System.out.println(e.getMessage());
        }
    }
}

class NegativeMarksException extends Exception{
    NegativeMarksException(){
        super("Invalid marks.");
    }
}