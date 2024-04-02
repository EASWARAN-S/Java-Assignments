package university;

import university.courses.Courses;
import university.faculty.Faculty;
import university.students.Students;

public class UniversityMain {
    public static void main(String[] args) {
        Students stud1 = new Students(1, "Rahul R", "22ITR011", "ITT");
        Courses course = new Courses("ITT", 1, "15", "5");
        Faculty fac = new Faculty("Rakesh R", "HOD", "CSE");

        System.out.println("The Faculty handling the Course" + course.getCourseName() + " is " + fac.getName());
    }
}
