import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================================
 * MAIN CLASS - UseCase3InventorySetup
 * =========================================================================
 * Use Case 3: Centralized Room Inventory Management
 * Description: Displays centralized inventory with detailed room attributes.
 * @version 3.1
 */

class RoomInventory {
    private Map<String, Integer> inventory;

    public RoomInventory() {
        this.inventory = new HashMap<>();
    }

    public void addRoomType(String type, int count) {
        inventory.put(type, count);
    }

    /**
     * Refactored method to match the required output format.
     * It prints detailed attributes for each room type.
     */
    public void displayDetailedStatus() {
        System.out.println("Hotel Room Inventory Status\n");

        // Single Room Details
        System.out.println("Single Room:");
        System.out.println("Beds: 1");
        System.out.println("Size: 250 sqft");
        System.out.println("Price per night: 1500.0");
        System.out.println("Available Rooms: " + inventory.getOrDefault("Single Room", 0) + "\n");

        // Double Room Details
        System.out.println("Double Room:");
        System.out.println("Beds: 2");
        System.out.println("Size: 400 sqft");
        System.out.println("Price per night: 2500.0");
        System.out.println("Available Rooms: " + inventory.getOrDefault("Double Room", 0) + "\n");

        // Suite Room Details
        System.out.println("Suite Room:");
        System.out.println("Beds: 3");
        System.out.println("Size: 750 sqft");
        System.out.println("Price per night: 5000.0");
        System.out.println("Available Rooms: " + inventory.getOrDefault("Suite Room", 0));
    }
}

public class Main {
    public static void main(String[] args) {
        // Initial Startup Messages from UC1
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("System initialized successfully.\n");

        RoomInventory hotelInventory = new RoomInventory();

        // Registering Room Types
        hotelInventory.addRoomType("Single Room", 5);
        hotelInventory.addRoomType("Double Room", 3);
        hotelInventory.addRoomType("Suite Room", 2);

        // Displaying the detailed status
        hotelInventory.displayDetailedStatus();
    }
}