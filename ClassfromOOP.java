package OOP;

class Car {
    String Name;
    String Model;

    public void myFunc() {
        System.out.println("The " + this.Model + " Model" + " " + this.Name + " is Speeding.");

    }

    Car(String Name, String Model) {
        // In below line this.Name represents class Car Name and Name at the right of =
        // represents parameter represents in Constructor
        this.Name = Name;
        this.Model = Model;
        // We can use Constructor to initialize variables of declared from Class and
        // send it as an argument in brackets where object is created;

        // System.out.println("This Is A Constructor and will be called everytime an
        // object is created");
    }
}

public class ClassfromOOP {
    public static void main(String[] args) {
        // System.out.println("will Create OBject");
        Car myobj = new Car("Toyota Corolla", "2017");
        // myobj.Name = "Toyota Corolla";
        // myobj.Model = "2016";
        myobj.myFunc();
        Car myobj2 = new Car("Ford", "2020");
        // myobj2.Name = "Ford";
        // myobj2.Model = "2020";
        myobj2.myFunc();
    }
}