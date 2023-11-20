package OOP;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displaypersons() {
        System.out.println("Person Name : " + this.name + "\n" + "Age of Person " + this.age + "\n");
    }
}

public class constructor {

    public static void main(String[] args) {
        System.out.println("Constructor making it easier for us to initialize");
        Person person1 = new Person("Imran Khan", 45);
        person1.displaypersons();
        Person person2 = new Person("Pat Cummins", 30);
        person2.displaypersons();
    }
}
