
public class q3 {

    private String name;

    public q3(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("Object " + name + " has been garbage collected.");
    }

    public static void main(String[] args) {
        q3 obj = new q3("Example Object");

        obj = null;

        System.gc();
    }
}