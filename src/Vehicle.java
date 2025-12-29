// Abstract base class representing a generic vehicle
public abstract class Vehicle {
    // Fields are protected so subclasses can access them directly if needed
    protected String brand;
    protected int year;

    // A vehicle has a driver but the driver exists outside the vehicle too (Aggregation)
    protected Driver driver;

    // Constructor to initialize common attributes
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();

    // Setter for assigning a driver
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // Concrete method common to all vehicles
    public void displayInfo() {
        System.out.println("--- Vehicle Info ---");
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);

        // Check if a driver is assigned to avoid null pointer errors
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("Driver: No driver assigned.");
        }
    }
}