public class Pair<K, V> {
    private K key;
    private V value;

    // Parameterized constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter method for key
    public K getKey() {
        return key;
    }

    // Setter method for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter method for value
    public V getValue() {
        return value;
    }

    // Setter method for value
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Create a Pair object with Integer key and String value
        Pair<Integer, String> myPair = new Pair<>(42, "Hello, World!");

        // Retrieve and print the key and value
        System.out.println("Key: " + myPair.getKey());
        System.out.println("Value: " + myPair.getValue());
    }
}