package OOP;

abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("Contructor of Abstract class");
    }

    public void myfunc() {
        System.out.println("We can create Constructor of Abstract class and even create normal functions inside it ");
    }
}

class Penguin extends Animal {
    public void walk() {
        System.out.println("Walking on 2 legs");

    }

    Penguin() {
        System.out.println("Constructor of Penguin");
    }
}

class Goat extends Animal {
    public void walk() {
        System.out.println("Walking on 4 legs");
    }
}

public class EasyAbstract {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.walk();
        Penguin peng = new Penguin();
        peng.walk();
    }
}