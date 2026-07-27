
public class Student {
    int studentid;
    String studentname;
    String course;

    Student() {
        this(0);
    }

    Student(int studentid) {
        this(studentid, "Not Provided");
    }

    Student(int studentid, String studentname) {
        this(studentid, studentname, "Not Assigned");
    }

    Student(int studentid, String studentname, String course) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.course = course;

        System.out.println("------ Student Details ----------");
        System.out.println("Student ID: " + this.studentid);
        System.out.println("Student Name: " + this.studentname);
        System.out.println("Course: " + this.course);
    }

    public static void main(String[] args) {
        new Student();
        new Student(101);
        new Student(102, "Hasika");
        new Student(103, "Hasika", "Java");