package IntegerMyListImplementation;

public class Main {
    public static void main(String[] args) {
        // Create a new list
        MyList list = new MyList();

        // Test adding elements
        System.out.println("Testing add operation:");
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        System.out.println("List after adding numbers 0,10,20,30,40: " + list);
        System.out.println("Current size: " + list.size());

        // Test getting elements
        System.out.println("\nTesting get operation:");
        System.out.println("Element at index 2: " + list.get(2));

        // Test invalid index
        try {
            System.out.println("Trying to get element at invalid index:");
            list.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test deleting by index
        System.out.println("\nTesting deleteByIndex:");
        list.deleteByIndex(2);
        System.out.println("List after deleting element at index 2: " + list);
        System.out.println("New size: " + list.size());

        // Test deleting by value
        System.out.println("\nTesting deleteByValue:");
        boolean deleted = list.deleteByValue(10);
        System.out.println("Was value 10 deleted? " + deleted);
        System.out.println("List after deleting value 10: " + list);

        // Test deleting non-existent value
        deleted = list.deleteByValue(999);
        System.out.println("Was value 999 deleted? " + deleted);

        // Test resize functionality
        System.out.println("\nTesting resize functionality:");
        MyList bigList = new MyList();
        // Add many elements
        for (int i = 0; i < 95; i++) {
            bigList.add(i);
        }
        System.out.println("Size after adding 95 elements: " + bigList.size());

        // Remove many elements to test shrinking
        for (int i = 0; i < 75; i++) {
            bigList.deleteByIndex(0);
        }
        System.out.println("Size after removing 75 elements: " + bigList.size());
        System.out.println("Remaining elements: " + bigList);

        // Test edge cases
        System.out.println("\nTesting edge cases:");
        MyList edgeList = new MyList();

        // Test empty list
        try {
            edgeList.deleteByIndex(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Correctly caught exception when deleting from empty list: " + e.getMessage());
        }

        // Add and delete same value multiple times
        System.out.println("\nTesting repeated operations:");
        edgeList.add(5);
        edgeList.add(5);
        edgeList.add(5);
        System.out.println("List after adding three 5s: " + edgeList);
        edgeList.deleteByValue(5);
        System.out.println("List after deleting first 5: " + edgeList);
        edgeList.deleteByValue(5);
        System.out.println("List after deleting second 5: " + edgeList);
    }
}