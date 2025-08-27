class pen {
    String color;
    String type;

    void write() {
        System.out.println("Writing with a " + color + " " + type + " pen.");
    }
}

public class OOPS {
    public static void main(String[] args) {
        pen p = new pen();
        p.color = "blue";
        p.type = "ballpoint";
        p.write();
        System.out.println("Hello, OOP World!");
    }

}
