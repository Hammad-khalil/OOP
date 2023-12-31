package OOP;

// This is BAse ClasS
class Shape {
    String color;

    public void ShapeTell() {
        System.out.println("Displayed color is : " + this.color);
    }
}

// This is a derived class and will use Base Class to Display the color
class Triangle extends Shape {

}

// This is an Example of Single Level Inheritance where one derived class uses
// properties of one Base Class
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Object Of Triangle will take Shape class Properties");
        Triangle obj = new Triangle();
        obj.color = "Red";
        obj.ShapeTell();
        System.out.println(obj.color);
    }
}