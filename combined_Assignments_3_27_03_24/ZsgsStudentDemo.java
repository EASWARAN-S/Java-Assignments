import java.util.Scanner;

class StudentParent {
    String name;
    int age;

    public StudentParent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("parent Constructor is called");
    }

}

class ZSGSStudent extends StudentParent {
    String grade;

    ZSGSStudent(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("Child Constructor is called");
    }

}

public class ZsgsStudentDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Father Name");
        String name = sc.nextLine();
        System.out.println("Enter the Father Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student Name");
        String studname = sc.nextLine();
        System.out.println("Enter the Student Age");
        int studage = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Grade");
        String grade = sc.nextLine();

        StudentParent stud = new StudentParent(name, age);
        ZSGSStudent zsStud = new ZSGSStudent(studname, studage, grade);
    }
}