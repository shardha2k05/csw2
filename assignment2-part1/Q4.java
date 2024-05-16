class Student1 {
    private String name;
    private String rollNumber;
    private int totalMarks;

    public Student1(String name, String rollNumber, int totalMarks) {
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

    public static Student1 linearSearch(Student1[] students, String targetRollNumber) {
        for (Student1 student : students) {
            if (student.getRollNumber().equals(targetRollNumber)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create an array of student objects
        Student1[] studentArray = new Student1[3];
        studentArray[0] = new Student1("Alice", "S123", 85);
        studentArray[1] = new Student1("Bob", "S456", 92);
        studentArray[2] = new Student1("Carol", "S789", 78);

        // Search for a student by roll number
        String targetRollNumber = "S456";
        Student1 foundStudent = linearSearch(studentArray, targetRollNumber);

        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Roll Number: " + foundStudent.getRollNumber());
            System.out.println("Total Marks: " + foundStudent.getTotalMarks());
        } else {
            System.out.println("Student with roll number " + targetRollNumber + " not found.");
        }
    }
}

