public class vehicleMain {
    public static void main(String[] args) {
        cars c = new cars();
        Bicycle b = new Bicycle();
        c.accelerate();
        c.brake();
        b.accelerate();
        b.brake();
        c.accelerate(30);
        c.accelerate(40,50);
        b.accelerate(30);
        b.accelerate(30,60);
    }
}
interface  Vehicle{
    void accelerate();
    void brake();
}
class cars implements Vehicle{

    @Override
    public void accelerate() {

        System.out.println("car is accelerating");
    }

    @Override
    public void brake() {

        System.out.println("car applied break");
    }
    public void accelerate(double speed){

        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }
    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for duration: " + duration + " seconds");
    }
}
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method overloading
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for duration: " + duration + " seconds");
    }
}