import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int StudId;
    int marks;

    public Student(String name, int StudId, int marks) {
        this.name = name;
        this.StudId = StudId;
        this.marks = marks;
    }

}

class SortById implements Comparator<Student> {

    public int compare(Student stu1, Student stu2) {
        int id1 = stu1.StudId;
        int id2 = stu2.StudId;
        if (id1 < id2)
            return -1;
        else if (id1 > id2)
            return 1;
        else
            return 0;
    }
}

class SortByName implements Comparator<Student> {

    public int compare(Student stu1, Student stu2) {
        String name1 = stu1.name;
        String name2 = stu2.name;
        return name1.compareTo(name2);

    }
}

class SortByMarks implements Comparator<Student> {

    public int compare(Student stu1, Student stu2) {
        int marks1 = stu1.marks;
        int marks2 = stu2.marks;
        if (marks1 < marks2)
            return -1;
        else if (marks1 > marks2)
            return 1;
        else
            return 0;

    }
}

public class CustomSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<Student>();
        System.out.println("Enter the number of students : ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of student : ");
            String name = sc.nextLine();
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student marks : ");
            int marks = sc.nextInt();
            sc.nextLine();
            Student stu = new Student(name, id, marks);
            studentList.add(stu);
        }

        System.out.println("Before Sorting ");
        System.out.printf("%-25s%-25s%-25s\n", "Student Id", "Name", "Marks");

        for (Student s : studentList) {
            System.out.printf("%-25d%-25s%-25d\n", s.StudId, s.name, s.marks);
        }

        System.out.println("Enter the Way to which you want to sort: \n1) ID \n2) Name \n3) Marks ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                Collections.sort(studentList, new SortById());
                break;
            case 2:
                Collections.sort(studentList, new SortByName());
                break;
            case 3:
                Collections.sort(studentList, new SortByMarks());
                break;
            default:
                System.out.println("Enter a valid option ..");
                break;
        }
        switch (choice) {
            case 1:
                System.out.println(" Sorted List By Student Id ");
                break;
            case 2:
                System.out.println(" Sorted List By Student Name ");
                break;
            case 3:
                System.out.println(" Sorted List By Student marks ");
                break;
            default:
                System.out.println(" Not Sorted  ");
                break;
        }

        System.out.printf("%-25s%-25s%-25s\n", "Student Id", "Name", "Marks");

        for (Student s : studentList) {
            System.out.printf("%-25d%-25s%-25d\n", s.StudId, s.name, s.marks);
        }

    }

}
