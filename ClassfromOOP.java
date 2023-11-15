package OOP;

/**
 * ClassfromOOP
 */

class Pen {
    String type;
    String color;

    public void myMethod() {
        System.out.println("Color of this Pen is : " + this.color + " And " +
                " Type of This Pen is : " + this.type + "\n");
    }

    Pen() {
        System.out.println("I'm Constructor");
    }
}

public class ClassfromOOP {

    public static void main(String[] args) {
        System.out.println("Creating Object");
        Pen pen1 = new Pen();
        pen1.type = "Ballpoint";
        pen1.color = "Teal";
        pen1.myMethod();
        Pen pen2 = new Pen();
        pen2.type = "Pointer";
        pen2.color = "Black";
        pen2.myMethod();
    }
}