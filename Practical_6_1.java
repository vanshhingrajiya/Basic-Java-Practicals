import java.util.Scanner;

class Practical_6_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int a;
            int b;
        try{
            System.out.println("Enter a : ");
            a = scanner.nextInt();
            System.out.println("Enter b : ");
            b = scanner.nextInt();
            int c = a/b;
            System.out.println(a + "/" + b + " = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("B can't be zero.");
        }
    }
}