import java.util.Scanner;

public class Practical_1_4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
}
