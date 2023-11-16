package OOP;

class Shape {
    String color;
}

class Triangle extends Shape {

}

// This is an Example of Single Level Inheritance where one derived class uses
// properties of one Base Class
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Object Of Triangle will take Shape class Properties");
        Triangle obj = new Triangle();
        obj.color = "Red";
        System.out.println(obj.color);
    }
}