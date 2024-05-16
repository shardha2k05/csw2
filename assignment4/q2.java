
public class q2 {
    private String name;

    public q2(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        // Create two instances of ReassigningReference
        q2 obj1 = new q2("Object 1");
        q2 obj2 = new q2("Object 2");
        obj1 = obj2;

        System.gc();
    }
}
