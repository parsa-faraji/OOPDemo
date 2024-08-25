// Define the Car class
public class Car {
    // Instance attributes
    private String brand;  // Brand of the car
    private int speedLimit;  // Speed limit of the car

    // Constructor to initialize instance attributes
    public Car(String brand, int speedLimit) {
        this.brand = brand;
        this.speedLimit = speedLimit;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed Limit: " + speedLimit + " km/h");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating instances (objects) of the Car class
        Car car1 = new Car("Toyota", 180);  // car1 is a Toyota with a speed limit of 180 km/h
        Car car2 = new Car("Honda", 200);   // car2 is a Honda with a speed limit of 200 km/h

        // Using the displayInfo method to show details of each car
        car1.displayInfo();  // Displays info for car1
        car2.displayInfo();  // Displays info for car2
    }
}
