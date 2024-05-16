class Student {
    private String name;
    private String rollNumber;
    private int age;

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Create a student object with an integer roll number
        Student student1 = new Student("Alice", "12345", 20);
        student1.displayDetails();

        // Create another student object with a string roll number
        Student student2 = new Student("Bob", "B6789", 22);
        student2.displayDetails();
    }
}
