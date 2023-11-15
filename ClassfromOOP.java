package OOP;

class Car {
    String Name;
    String Model;

    public void myFunc() {
        System.out.println("The " + this.Model + " Model" + " " + this.Name + " is Speeding.");

    }

    Car() {
        System.out.println("This Is A Constructor and will be called everytime an object is created");
    }
}

public class ClassfromOOP {
    public static void main(String[] args) {
        // System.out.println("will Create OBject");
        Car myobj = new Car();
        myobj.Name = "Toyota Corolla";
        myobj.Model = "2016";
        myobj.myFunc();
        Car myobj2 = new Car();
        myobj2.Name = "Ford";
        myobj2.Model = "2020";
        myobj2.myFunc();
    }
}