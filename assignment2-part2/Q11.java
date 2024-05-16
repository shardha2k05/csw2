
import java.util.HashMap;
import java.util.Map;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 6, 8, -1, -10, 15 }; // Replace with your actual array

        int result = findSmallestMissingNumber(arr);
        System.out.println("The smallest positive missing number is: " + result);
    }

    public static int findSmallestMissingNumber(int[] arr) {
        int n = arr.length;
        Map<Integer, Boolean> presentMap = new HashMap<>();

        // Mark positive elements as present in the map
        for (int num : arr) {
            if (num > 0 && num <= n) {
                presentMap.put(num, true);
            }
        }

        // Find the first missing positive number
        for (int i = 1; i <= n; i++) {
            if (!presentMap.getOrDefault(i, false)) {
                return i;
            }
        }

        // If all positive numbers are present, return n+1
        return n + 1;
    }
}

