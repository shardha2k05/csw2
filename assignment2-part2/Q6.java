
import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Display the TreeSet
        System.out.println("TreeSet elements: " + numbers);

        // Ask the user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        // Search if the number is present in the set
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the TreeSet.");
        } else {
            System.out.println(searchNumber + " is not found in the TreeSet.");
        }

        // Remove an element from the TreeSet
        System.out.print("Enter a number to remove: ");
        int removeNumber = scanner.nextInt();
        if (numbers.remove(removeNumber)) {
            System.out.println(removeNumber + " removed successfully.");
        } else {
            System.out.println(removeNumber + " not found in the TreeSet.");
        }

        // Display the updated TreeSet
        System.out.println("Updated TreeSet elements: " + numbers);
    }
}
