package OOP;

class Shape {
    String color;
    String type;

    public void shapeDisplay() {
        System.out.println("Color of this Shape is : " + this.color + " Type of this Shape is : " + this.type);
    }
}

class Triangle extends Shape {

}

public class MultiLvlInheritance {
    public static void main(String[] args) {
        System.out.println(
                "This is Multi lvl inheritance where one derived class inherit properties of another derived class");
        Triangle myobj = new Triangle();
        myobj.color = "Purple";
        myobj.type = "2D";
        myobj.shapeDisplay();
    }
}
