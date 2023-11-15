package OOP;

// PolyMorphism has two types Function Overloading and Function Overiding and below we will use function overloading and we'll use overriding after learning Inheritance.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Hello Polymorphism");
        Calculator calc = new Calculator();
        // For int Value Store
        int intresult = calc.add(10, 20);
        System.out.println(intresult);

        // for double int Value Store

        double dblresult = calc.add(10.99, 20.18);
        System.out.println(dblresult);

    }
}
