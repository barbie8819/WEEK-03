package singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        // Adding items
        inventory.addItemAtEnd("Item A", 101, 10, 5.5);
        inventory.addItemAtBeginning("Item B", 102, 20, 2.0);
        inventory.addItemAtPosition("Item C", 103, 15, 3.0, 1);

        // Display all items
        inventory.displayAllItems();

        // Update quantity
        inventory.updateQuantityById(102, 25);

        // Search items
        inventory.searchById(101);
        inventory.searchByName("Item C");

        // Calculate total value
        inventory.calculateTotalValue();

        // Sort items
        inventory.sortByNameAscending();
        System.out.println("\nItems sorted by name (ascending):");
        inventory.displayAllItems();

        inventory.sortByPriceDescending();
        System.out.println("\nItems sorted by price (descending):");
        inventory.displayAllItems();
    }
}
