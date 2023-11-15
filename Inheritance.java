package OOP;

// Inheritance
// "Inheritance is when one class uses properties of other class, we can see inherits properties of another class " "Properties are which we name after variable like in String color , we defined color and it is an example of properties"
class Vehicle {
    String color;
    String model;

    void start() {
        System.out.println("Vehicle Started");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {

    void accelerate() {
        System.out.println("Car is Accelerating");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Vehicle myobj = new Vehicle();
        myobj.start();
        myobj.stop();
    }
}