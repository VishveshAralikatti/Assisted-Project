package CoreJava;

//Class definition
class Car {
 // Instance variables
 String make;
 String model;
 int year;

 // Constructor
 public Car(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 // Method to display car information
 public void displayInfo() {
     System.out.println("Car make: " + make);
     System.out.println("Car model: " + model);
     System.out.println("Car year: " + year);
 }
}

//Main class

public class ClassDemo {
	public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2022);

        // Calling a method on the object
        System.out.println("My car information:");
        myCar.displayInfo();
    }

}
