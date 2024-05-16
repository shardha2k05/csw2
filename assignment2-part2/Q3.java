
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private int modelNo;
    private String name;
    private int stock;

    // Parameterized constructor
    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    // Getter method for modelNo
    public int getModelNo() {
        return modelNo;
    }

    // Setter method for modelNo
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for stock
    public int getStock() {
        return stock;
    }

    // Setter method for stock
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Override compareTo method to compare based on stock
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Create an ArrayList to store Car objects
        List<Car> carList = new ArrayList<>();

        // Add Car objects
        carList.add(new Car(101, "Toyota", 50));
        carList.add(new Car(102, "Honda", 30));
        carList.add(new Car(103, "Ford", 20));

        // Sort cars based on stock
        Collections.sort(carList);

        // Print the updated sorted list
        System.out.println("Sorted Cars by Stock:");
        for (Car car : carList) {
            System.out.println("Model No: " + car.getModelNo() + ", Name: " + car.getName() + ", Stock: " + car.getStock());
        }
    }
}