
public class q5 {
    private int intValue;
    private double doubleValue;

    public void initialize(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Create objects
        q5 obj1 = new q5();
        q5 obj2 = new q5();

        // Initialize objects
        obj1.initialize(10, 5.5);
        obj2.initialize(20, 8.8);

        // Make objects unreachable
        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.gc();

        // Print memory usage
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        System.out.println("Memory used: " + usedMemory + " bytes");
        System.out.println("Total memory: " + totalMemory + " bytes");
    }
}
