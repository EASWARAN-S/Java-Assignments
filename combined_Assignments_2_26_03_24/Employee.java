public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeeEmail;
    private long employeeMobile;
    private String employeeDesignation;
    private String employeeDoj;
    private static String companyName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public long getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(long employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeDoj() {
        return employeeDoj;
    }

    public void setEmployeeDoj(String employeeDoj) {
        this.employeeDoj = employeeDoj;
    }

    public void display() {
        System.out.println("Email: " + employeeEmail);
        System.out.println("Mobile: " + employeeMobile);
        System.out.println("Address: " + employeeAddress);
        System.out.println("Designation: " + employeeDesignation);
        System.out.println("Date of Joining : " + employeeDoj);
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

}
