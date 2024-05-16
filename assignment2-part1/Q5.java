
class Student2 {
    private String name;
    private String rollNumber;
    private int totalMarks;

    public Student2(String name, String rollNumber, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getRollNumber().compareTo(students[j + 1].getRollNumber()) > 0) {
                    // Swap students[j] and students[j + 1]
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of student objects
        Student2[] studentArray = new Student2[5];
        studentArray[0] = new Student2("Alice", "S123", 85);
        studentArray[1] = new Student2("Bob", "S456", 92);
        studentArray[2] = new Student2("Carol", "S789", 78);
        studentArray[3] = new Student2("David", "S234", 88);
        studentArray[4] = new Student2("Eve", "S567", 95);

        // Sort the array using Bubble Sort based on roll number
        bubbleSort(studentArray);

        // Print sorted student details
        System.out.println("Sorted Student Details:");
        for (Student2 student : studentArray) {
            System.out.println("Name: " + student.getName() +
                    ", Roll Number: " + student.getRollNumber() +
                    ", Total Marks: " + student.getTotalMarks());
        }
    }
}
