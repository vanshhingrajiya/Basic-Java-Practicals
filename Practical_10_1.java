import java.util.Scanner;

public class Practical_10_1 {

    public static String dec2Bin(int value) {
        if (value == 0) {
            return "0";
        }
        if (value == 1) {
            return "1";
        }
        return dec2Bin(value / 2) + (value % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = dec2Bin(decimal);
        System.out.println("Binary equivalent: " + binary);
    }
}
