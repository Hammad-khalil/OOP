package OOP;

class Form {
    String color;
    String type;

    public void FormDisplay() {
        System.out.println("Color of this Form is : " + this.color + " Type of this Form is : " + this.type);
    }
}

class Circle extends Form {

}

public class MultiLvlInheritance {
    public static void main(String[] args) {
        System.out.println(
                "This is Multi lvl inheritance where one derived class inherit properties of another derived class");
        Circle myobj = new Circle();
        myobj.color = "Purple";
        myobj.type = "2D";
        myobj.FormDisplay();
    }
}
