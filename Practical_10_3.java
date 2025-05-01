public class Practical_10_3 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};
        int index = Practical_10_3.binarySearch(numbers, 7);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            E midVal = list[mid];

            if (midVal.compareTo(key) < 0) {
                low = mid + 1;
            } else if (midVal.compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }

        return -1; // key not found
    }
}
