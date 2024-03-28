class Employee {
    static String company = "Zoho Corp";
    String name;
    String designation;
    int employeeId;

    public Employee(String name, String designation, int employeeId) {
        this.name = name;
        this.designation = designation;
        this.employeeId = employeeId;
    }

    public void getDetails() {
        System.out.printf("%-15s%15s%-15s", "EmployeeId", "Name", "Designation");
        System.out.println();
        System.out.printf("%-15d%15s%-15s", employeeId, name, designation);
    }
}

class HourlyEmployee extends Employee {
    int hours;

    public HourlyEmployee(String name, String designation, int employeeId, int hours) {
        super(name, designation, employeeId);
        this.hours = hours;
    }

    public void getDetails() {
        System.out.println();
        System.out.printf("%-15s%-15s%-15s%-15s", "EmployeeId", "Name", "Designation", "Hourly Salary");
        System.out.println();
        System.out.printf("%-15d%-15s%-15s%15d", employeeId, name, designation, (hours * 150));
    }
}

class SalariedEmployee extends Employee {
    double monthlySalary;

    public SalariedEmployee(String name, String designation, int employeeId, double monthlySalary) {
        super(name, designation, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public void getDetails() {
        System.out.println();
        System.out.printf("%-15s%-15s%-15s%-15s", "EmployeeId", "Name", "Designation", "Monthly Salary");
        System.out.println();
        System.out.printf("%-15d%-15s%-15s%15.2f", employeeId, name, designation, monthlySalary);
    }
}

public class EmployeeOverrideDemo {
    public static void main(String args[]) {
        Employee emp1 = new HourlyEmployee("Rajesh", "Software Developer", 1254, 135);
        Employee emp2 = new SalariedEmployee("Raseeth", "Chief Architect", 750, 80000);
        System.out.println("Details of Hourly Employee:");
        emp1.getDetails();
        System.out.println();
        System.out.println();
        System.out.println("Details of Salaried Employee:");
        emp2.getDetails();
    }
}
