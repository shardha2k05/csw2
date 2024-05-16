import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Interface class for loose coupling
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

// Student class
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class
class Course {
    private String courseId;
    private String name;
    private int maxCapacity;
    private List<Student> enrolledStudents;

    public Course(String courseId, String name, int maxCapacity) {
        this.courseId = courseId;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public void dropStudent(Student student) {
        enrolledStudents.remove(student);
    }
}

// Enrollment class
class Enrollment implements EnrollmentSystem {
    private Map<Course, List<Student>> enrollments;

    public Enrollment() {
        enrollments = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        if (!enrollments.containsKey(course)) {
            enrollments.put(course, new ArrayList<>());
        }
        List<Student> students = enrollments.get(course);
        if (course.enrollStudent(student)) {
            students.add(student);
            System.out.println(student.getName() + " enrolled in " + course.getName());
        } else {
            System.out.println("Course " + course.getName() + " is full. Enrollment failed for " + student.getName());
        }
    }

    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollments.containsKey(course)) {
            List<Student> students = enrollments.get(course);
            if (students.contains(student)) {
                course.dropStudent(student);
                students.remove(student);
                System.out.println(student.getName() + " dropped from " + course.getName());
            } else {
                System.out.println(student.getName() + " is not enrolled in " + course.getName());
            }
        } else {
            System.out.println("No enrollment record found for " + course.getName());
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        for (Map.Entry<Course, List<Student>> entry : enrollments.entrySet()) {
            Course course = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println("Course: " + course.getName() + ", Enrolled Students: ");
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
    }
}

// Main class
public class studentMain {
    public static void main(String[] args) {
        Student student1 = new Student("1001", "Alice");
        Student student2 = new Student("1002", "Bob");

        Course course1 = new Course("CSCI101", "Introduction to Computer Science", 30);
        Course course2 = new Course("MATH101", "Calculus I", 25);

        EnrollmentSystem enrollmentSystem = new Enrollment();
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);

        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.enrollStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course1);
        enrollmentSystem.dropStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();
    }
}
