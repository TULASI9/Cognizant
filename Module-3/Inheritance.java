class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine starts");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine roars to life");
    }
}

public class InheritanceVehicleExample {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        Car car = new Car();

        genericVehicle.startEngine();  // Output: Vehicle engine starts
        car.startEngine();             // Output: Car engine roars to life
    }
}
