package OOP;

/*
  This is an Example of Hybrid Inheritance,
  where Circle inherits properties of Form and Rectangle also inherits properties
  of Circle and they both inherits properties of Form with no link to each other and also Parallelogram inherits properties of Rectangle.🤠🐉 :>
  ☠☠☠
*/
class Form {
    String color;
    String type;

    public void FormDisplay(String name) {
        System.out
                .println(name + ":   Color of this Form is : " + this.color + " Type of this Form is : " + this.type);
    }
}

class Circle extends Form {

}

class Rectangle extends Form {

}

class Parallelogram extends Rectangle {

}

public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println(
                "This is Hybrid inheritance where one derived class inherit properties of another derived class and one derived class does not");
        // Creating Object For Circle
        Circle myobj = new Circle();
        myobj.color = "Purple";
        myobj.type = "2D";
        myobj.FormDisplay("Circle");
        // Creating Object For Rectangle
        Rectangle recobj = new Rectangle();
        recobj.color = "Blue";
        recobj.type = "quadrilateral";
        recobj.FormDisplay("Rectangle");
        // Creating Object For Parallelogram
        Parallelogram parobj = new Parallelogram();
        parobj.color = "Teal";
        parobj.type = "Parallelogram";
        parobj.FormDisplay("Parallelogram");
    }
}
