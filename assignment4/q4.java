
public class q4 {

    private String name;

    public q4(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("Object " + name + " has been garbage collected.");
    }

    public static void main(String[] args) {
        // Creating an anonymous object
        new q4("Anonymous Object");

        System.gc();
    }
}