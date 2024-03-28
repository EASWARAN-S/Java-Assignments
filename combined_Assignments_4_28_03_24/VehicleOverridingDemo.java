class Vehicle {
    String model;
    String name;

    public Vehicle(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public void start() {
        System.out.println("Vehicle is moving");
    }

    public void stop() {
        System.out.println("Vehicle is stopped");
    }
}

class Car extends Vehicle {
    public Car(String name, String model) {
        super(model, name);
    }

    public void start() {
        System.out.println(name + " Car is moving");
    }

    public void stop() {
        System.out.println(name + " Car is stopped");
    }
}

class Truck extends Vehicle {
    public Truck(String name, String model) {
        super(model, name);
    }

    public void start() {
        System.out.println(name + "  Truck is moving");
    }

    public void stop() {
        System.out.println(name + " Truck is stopped");
    }
}

class Bike extends Vehicle {
    public Bike(String name, String model) {
        super(model, name);
    }

    public void start() {
        System.out.println(name + " Bike is moving");
    }

    public void stop() {
        System.out.println(name + " Bike is stopped");
    }
}

public class VehicleOverridingDemo {
    public static void main(String args[]) {
        Vehicle v1 = new Car("Toyoto", "2012");
        v1.start();
        v1.stop();
        v1 = new Bike("Honda Unicorn", "2016");
        v1.start();
        v1.stop();
        v1 = new Truck("TATA Ranger", "2.2");
        v1.start();
        v1.stop();
    }
}
