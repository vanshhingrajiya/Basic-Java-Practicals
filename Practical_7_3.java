import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Practical_7_3{
    public static void main(String[] args) {
        String fileName = "Practical7.txt";
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }

            Random r = new Random();
            PrintWriter writer = new PrintWriter(file);

            for (int i = 0; i < 100; i++) {
                int num = r.nextInt(100);
                writer.print(num + " ");
            }
            writer.close();
            System.out.println("100 random integers written to the file.");

            Scanner reader = new Scanner(file);
            int[] numbers = new int[100];
            int index = 0;

            while (reader.hasNextInt() && index < 100) {
                numbers[index] = reader.nextInt();
                index++;
            }
            reader.close();

            Arrays.sort(numbers);

            System.out.println("\nSorted integers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
