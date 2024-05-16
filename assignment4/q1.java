

public class q1 {
    private String name;

    public q1(String name) {
        this.name = name;
    }

    public void show() {
        new q1("InnerObject").display();
    }

    public void display() {
        new q1("InnerInnerObject");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        new q1("MainObject").show();
        System.gc();
    }
}