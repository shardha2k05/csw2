
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    // Parameterized constructor
    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    // Getter methods for address attributes
    public String getPlotNo() {
        return plotNo;
    }

    public String getAt() {
        return at;
    }

    public String getPost() {
        return post;
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Create a TreeMap with person names as keys and Address objects as values
        TreeMap<String, Address> addressMap = new TreeMap<>();

        // Add some entries
        addressMap.put("Alice", new Address("123", "XYZ Street", "CityA"));
        addressMap.put("Bob", new Address("456", "ABC Road", "CityB"));
        addressMap.put("Charlie", new Address("789", "LMN Avenue", "CityC"));

        // Display the entries using an iterator
        System.out.println("Addresses in TreeMap:");
        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            String personName = entry.getKey();
            Address address = entry.getValue();
            System.out.println("Name: " + personName + ", Address: " +
                    address.getPlotNo() + ", " + address.getAt() + ", " + address.getPost());
        }
    }
}