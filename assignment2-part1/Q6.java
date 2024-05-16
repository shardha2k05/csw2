
class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        // Generate a unique ID based on name, color, and type
        return (name.hashCode() * 31) + (color.hashCode() * 17) + type.hashCode();
    }

    public static void main(String[] args) {
        // Create animal objects
        Animal dog = new Animal("Buddy", "Brown", "Pet");
        Animal tiger = new Animal("Shera", "Orange", "Wild");

        // Print hash codes
        System.out.println("Hash code for " + dog.name + ": " + dog.hashCode());
        System.out.println("Hash code for " + tiger.name + ": " + tiger.hashCode());
    }
}