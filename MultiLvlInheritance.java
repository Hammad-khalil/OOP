package OOP;

/*
  This is an Example of Multi Level Inheritance,
  where Circle inherits properties of Form and then Rectangle inherits properties
  of Circle which was inherited by Circle from Form itself :>
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

class Rectangle extends Circle {

}

public class MultiLvlInheritance {
    public static void main(String[] args) {
        System.out.println(
                "This is Multi lvl inheritance where one derived class inherit properties of another derived class");
        Circle myobj = new Circle();
        myobj.color = "Purple";
        myobj.type = "2D";
        myobj.FormDisplay("Circle");
        Rectangle recobj = new Rectangle();
        recobj.color = "Blue";
        recobj.type = "quadrilateral";
        recobj.FormDisplay("Rectangle");
    }
}
