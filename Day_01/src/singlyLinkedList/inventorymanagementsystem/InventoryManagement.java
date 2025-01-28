package singlylinkedlist.inventorymanagementsystem;

public class InventoryManagement {
    class Item {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Item next;

        public Item(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }
    private Item head;

    public InventoryManagement() {
        this.head = null;
    }

    // Add an item at the beginning
    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    // Add an item at a specific position
    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        if (position <= 0 || head == null) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item newItem = new Item(itemName, itemId, quantity, price);
        Item temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove an item by Item ID
    public void removeItemById(int itemId) {
        if (head == null) {
            System.out.println("No items to remove.");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed: " + itemId);
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found: " + itemId);
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed: " + itemId);
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantityById(int itemId, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = quantity;
                System.out.println("Quantity updated for Item ID: " + itemId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found: " + itemId);
    }

    // Search for an item by Item ID
    public void searchById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item Found: " + temp.itemName + " | Quantity: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found: " + itemId);
    }

    // Search for an item by Item Name
    public void searchByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: " + temp.itemName + " | Quantity: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found: " + itemName);
    }

    // Calculate and display the total value of inventory
    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Display all items
    public void displayAllItems() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }
        Item temp = head;
        System.out.println("Inventory Items:");
        while (temp != null) {
            System.out.println(temp.itemId + " | " + temp.itemName + " | Quantity: " + temp.quantity + " | Price: " + temp.price);
            temp = temp.next;
        }
    }

    // Sort items by Item Name in ascending order
    public void sortByNameAscending() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, true);
    }

    // Sort items by Price in descending order
    public void sortByPriceDescending() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, false);
    }

    private Item mergeSort(Item node, boolean sortByName) {
        if (node == null || node.next == null) {
            return node;
        }
        Item middle = getMiddle(node);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(node, sortByName);
        Item right = mergeSort(nextOfMiddle, sortByName);

        return sortedMerge(left, right, sortByName);
    }

    private Item sortedMerge(Item a, Item b, boolean sortByName) {
        if (a == null) return b;
        if (b == null) return a;

        Item result;
        if (sortByName) {
            if (a.itemName.compareToIgnoreCase(b.itemName) <= 0) {
                result = a;
                result.next = sortedMerge(a.next, b, true);
            } else {
                result = b;
                result.next = sortedMerge(a, b.next, true);
            }
        } else {
            if (a.price >= b.price) {
                result = a;
                result.next = sortedMerge(a.next, b, false);
            } else {
                result = b;
                result.next = sortedMerge(a, b.next, false);
            }
        }
        return result;
    }

    private Item getMiddle(Item node) {
        if (node == null) return node;
        Item slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
