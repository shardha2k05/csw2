
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    // Parameterized constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

class ArrayListUser {
    public static void main(String[] args) {
        // Create an ArrayList to store User objects
        List<User> userList = new ArrayList<>();

        // Add User objects
        userList.add(new User("Alice", 30));
        userList.add(new User("Bob", 25));
        userList.add(new User("Charlie", 28));

        // Retrieve and print name and age of users
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }

        // Sort users based on age
        Collections.sort(userList, Comparator.comparingInt(User::getAge));

        // Print the updated list
        System.out.println("\nSorted Users by Age:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}