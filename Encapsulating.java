package OOP;

class Vehicle {
    private String wheel;
    // private String Engine;
    // private Boolean Light;

    public String getwheel() {
        return this.wheel;
    }

    public void setwheel(String name) {
        this.wheel = name;
    }
}

public class Encapsulating {
    public static void main(String[] args) {
        System.out.println("Starting Encapsulation");
        Vehicle mywheel = new Vehicle();
        mywheel.setwheel("Continental Tyres");
        System.out.println("The Wheel is" + mywheel.getwheel());
    }
}
