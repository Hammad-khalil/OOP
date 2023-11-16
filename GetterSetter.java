package OOP;

class Account {
    public String name;
    private String password;

    public String getpass() {
        return this.password;
    }

    public void setpass(String pass) {
        this.password = pass;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        System.out.println("Getters and Setters will be used to access and set private properties");
        Account value = new Account();
        value.name = "Personal Account";
        value.setpass("JavaisInteresting");
        System.out.println("Password is: " + value.getpass());
    }

}