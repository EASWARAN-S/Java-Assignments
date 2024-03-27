abstract class Vehicle {
    protected String companyName;
    protected String vehicleModel;
    protected int year;

    public Vehicle(String companyName, String vehicleModel, int year) {
        this.companyName = companyName;
        this.vehicleModel = vehicleModel;
        this.year = year;
    }

    abstract public void display();
}

class Car extends Vehicle {

    public Car(String companyName, String vehicleModel, int year) {
        super(companyName, vehicleModel, year);
    }

    public void display() {
        System.out.println("Car Details");
        System.out.println("Car Maker Name : " + companyName);
        System.out.println("Car Model : " + vehicleModel);
        System.out.println("Car Manufactured Year : " + year);
    }
}

class Bike extends Vehicle {

    public Bike(String companyName, String vehicleModel, int year) {
        super(companyName, vehicleModel, year);
    }

    public void display() {
        System.out.println("Bike Details");
        System.out.println("Bike Maker Name : " + companyName);
        System.out.println("Bike Model : " + vehicleModel);
        System.out.println("Bike Manufactured Year : " + year);
    }
}

class MotorCycle extends Vehicle {

    public MotorCycle(String companyName, String vehicleModel, int year) {
        super(companyName, vehicleModel, year);
    }

    public void display() {
        System.out.println("MotorCycle Details");
        System.out.println("MotorCycle Maker Name : " + companyName);
        System.out.println("MotorCycle Model : " + vehicleModel);
        System.out.println("MotorCycle Manufactured Year : " + year);
    }
}

public class VehicleHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Hierarchy Demo");
        Vehicle v1 = new Car("TATA", "NANO", 2022);
        v1.display();
        v1 = new Bike("HONDA", "Unicorn", 2011);
        v1.display();
        v1 = new MotorCycle("HONDA", "Shine", 2021);
        v1.display();
    }
}