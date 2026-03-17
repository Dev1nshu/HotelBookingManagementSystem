/**
 * =========================================================================
 * MAIN CLASS - UseCase2RoomInitialization
 * =========================================================================
 * Use Case 2: Basic Room Types & Static Availability
 * * Description:
 * This class demonstrates domain modeling using Abstract classes and Inheritance.
 * It initializes specific room types and displays their static availability.
 * * @author Developer
 * @version 2.0
 */

// 1. Abstract Class representing the generalized concept of a Room
abstract class Room {
    private String roomType;
    private double price;

    public Room(String roomType, double price) {
        this.roomType = roomType;
        this.price = price;
    }

    public String getRoomType() { return roomType; }
    public double getPrice() { return price; }

    // Abstract method to be implemented by concrete classes
    public abstract void displayFeatures();
}

// 2. Concrete implementation: Single Room
class SingleRoom extends Room {
    public SingleRoom() { super("Single Room", 100.0); }
    @Override
    public void displayFeatures() {
        System.out.println("Features: 1 Bed, Compact Space, High-speed Wi-Fi");
    }
}

// 3. Concrete implementation: Double Room
class DoubleRoom extends Room {
    public DoubleRoom() { super("Double Room", 180.0); }
    @Override
    public void displayFeatures() {
        System.out.println("Features: 2 Beds, Extra Storage, City View");
    }
}

// 4. Concrete implementation: Suite Room
class SuiteRoom extends Room {
    public SuiteRoom() { super("Suite Room", 350.0); }
    @Override
    public void displayFeatures() {
        System.out.println("Features: King Size Bed, Living Area, Mini Bar, Ocean View");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("System initialized successfully.");
        System.out.println("--------------------------------------------");

        // Polimorphism: Referencing concrete objects using the Abstract type
        Room single = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static Availability Representation (using simple variables)
        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        // Display Room Details and Availability
        displayRoomInfo(single, singleAvailability);
        displayRoomInfo(doubleRm, doubleAvailability);
        displayRoomInfo(suite, suiteAvailability);
    }

    private static void displayRoomInfo(Room room, int availability) {
        System.out.println("Room Type   : " + room.getRoomType());
        System.out.println("Price       : $" + room.getPrice());
        System.out.print("Availability: " + availability + " rooms left | ");
        room.displayFeatures();
        System.out.println("--------------------------------------------");
    }
}