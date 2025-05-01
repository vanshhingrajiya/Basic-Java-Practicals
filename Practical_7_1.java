import java.io.*;
import java.util.Scanner;

public class Practical_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String stringToRemove = args[0];
            String fileName = args[1];

            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder modifiedContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.replace(stringToRemove, "");
                modifiedContent.append(line).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(modifiedContent.toString());
            writer.close();

            System.out.println("All occurrences of \"" + stringToRemove + "\" have been removed from " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
