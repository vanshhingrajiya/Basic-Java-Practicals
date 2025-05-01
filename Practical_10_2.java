import java.util.ArrayList;

public class Practical_10_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");

        ArrayList<String> uniqueNames = Practical_10_2.removeDuplicates(names);

        System.out.println("Original list: " + names);
        System.out.println("Without duplicates: " + uniqueNames);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();

        for (E element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        return newList;
    }
}
