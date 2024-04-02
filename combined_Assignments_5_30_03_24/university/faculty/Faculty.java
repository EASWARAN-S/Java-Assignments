package university.faculty;

public class Faculty {
    private String name;
    private String designation;
    private String facultyDepartment;

    public Faculty(String name, String designation, String facultyDepartment) {
        this.name = name;
        this.designation = designation;
        this.facultyDepartment = facultyDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFacultyDepartment() {
        return facultyDepartment;
    }

    public void setFacultyDepartment(String facultyDepartment) {
        this.facultyDepartment = facultyDepartment;
    }

}
