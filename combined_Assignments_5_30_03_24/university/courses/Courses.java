package university.courses;

public class Courses {
    private String courseName;
    private int courseId;
    private String courseDuration;
    private String noOfunits;

    public Courses(String courseName, int courseId, String courseDuration, String noOfunits) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseDuration = courseDuration;
        this.noOfunits = noOfunits;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseDuration() {
        return this.courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getNoOfunits() {
        return this.noOfunits;
    }

    public void setNoOfunits(String noOfunits) {
        this.noOfunits = noOfunits;
    }

}
