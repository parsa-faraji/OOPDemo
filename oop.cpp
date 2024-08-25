  #include <iostream>
#include <string>
using namespace std;

class Car {
private:
    string brand;  // Instance attribute for the brand of the car
    int speed_limit;  // Instance attribute for the speed limit of the car

public:
    // Constructor to initialize instance attributes
    Car(string b, int s) : brand(b), speed_limit(s) {}

    // Method to display car information
    void displayInfo() {
        cout << "Brand: " << brand << ", Speed Limit: " << speed_limit << " km/h" << endl;
    }
};

int main() {
    // Creating instances (objects) of the Car class
    Car car1("Toyota", 180);  // car1 is a Toyota with a speed limit of 180 km/h
    Car car2("Honda", 200);   // car2 is a Honda with a speed limit of 200 km/h

    // Using the displayInfo method to show details of each car
    car1.displayInfo();  // Displays info for car1
    car2.displayInfo();  // Displays info for car2

    return 0;
}
