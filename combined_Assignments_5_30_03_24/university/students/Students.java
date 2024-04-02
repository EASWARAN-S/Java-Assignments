package university.students;

public class Students {
    private int studentId;
    private String studentName;
    private String rollNo;
    private String courseName;

    public Students(int studentId, String studentName, String rollNo, String courseName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.courseName = courseName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
