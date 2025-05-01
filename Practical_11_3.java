import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practical_11_3 {
    public static void main(String[] args) {
        Map<String, String> stateCapitalMap = new HashMap<>();

        stateCapitalMap.put("Gujarat", "Gandhinagar");
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Rajasthan", "Jaipur");
        stateCapitalMap.put("Karnataka", "Bengaluru");
        stateCapitalMap.put("Tamil Nadu", "Chennai");
        stateCapitalMap.put("Punjab", "Chandigarh");
        stateCapitalMap.put("Uttar Pradesh", "Lucknow");
        stateCapitalMap.put("West Bengal", "Kolkata");
        stateCapitalMap.put("Bihar", "Patna");
        stateCapitalMap.put("Madhya Pradesh", "Bhopal");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Indian state: ");
        String state = input.nextLine();

        String capital = stateCapitalMap.get(state);

        if (capital != null) {
            System.out.println("The capital of " + state + " is " + capital + ".");
        } else {
            System.out.println("State not found in the database.");
        }

        input.close();
    }
}
