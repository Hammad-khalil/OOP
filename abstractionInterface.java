package OOP;
// Abstraction with Interface

interface Animals {
    void catsound();

    // if u create two methods in interface then u have to use all the methods in
    // the class that implements it.
    void dogsound();
}

class Cat implements Animals {
    public void catsound() {
        System.out.println("Meoww !!!!");
    }

    public void dogsound() {
        System.out.println("Woof !!!");
    }
}

// class Dog implements Animals {
// public void dogsound() {
// System.out.println("Woof !!!");
// }
// }

public class abstractionInterface {
    public static void main(String[] args) {
        System.out.println("Abstraction using Interface");
        Cat sound = new Cat();
        sound.catsound();
        sound.dogsound();
    }
}
