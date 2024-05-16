import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 7, 5};

        // Create a HashSet to store repeating integers
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Repeating integers in the array:");
        for (int num : arr) {
            if (!set.add(num)) {
                // If already in the set, it's a repeating integer
                System.out.print(num + " ");
            }
        }
    }
}
