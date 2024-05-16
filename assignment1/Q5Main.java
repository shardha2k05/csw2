class College{
    String collegeName;
    String collegeLoc;  

public College(String collegeName,String collegeLoc){
    this.collegeName=collegeName;
    this.collegeLoc=collegeLoc;
}
}
class Student{
    int studentId;
    String studentName;
    College college;
public Student (int studentId,String studentName,College college){
    this.studentId=studentId;
    this.studentName=studentName;
    this.college=college;
}

    public void displayStudentInfo(){
    System.out.println("id: "+studentId);
    System.out.println("name: "+studentName);
    System.out.println("college name: "+college.collegeName);
    System.out.println("college location: "+college.collegeLoc);


}
}


public class Q5Main {
    public static void main(String[] args) {
        College c1=new College("iter", "bbsr");
        College c2=new College("vikash", "kantabada");

        Student s1=new Student(1, "shardha", c1);
        Student s2=new Student(2, "smruti", c2);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
