package GenericMyListImplemenation;

public class Main {
    public static void main(String[] args) {
        // Test with Integer type
        System.out.println("Testing MyList with Integers:");
        MyList<Integer> intList = new MyList<>();

        // Test adding elements
        System.out.println("\nAdding elements:");
        for (int i = 0; i < 5; i++) {
            intList.add(i * 10);
        }
        System.out.println("List after adding: " + intList);
        System.out.println("Size: " + intList.size());

        // Test getting elements
        System.out.println("\nGetting elements:");
        System.out.println("Element at index 2: " + intList.get(2));
        try {
            System.out.println("Trying to get element at invalid index:");
            intList.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test deleting by index
        System.out.println("\nDeleting by index:");
        intList.deleteByIndex(2);
        System.out.println("List after deleting index 2: " + intList);

        // Test deleting by value
        System.out.println("\nDeleting by value:");
        intList.deleteByValue(10);
        System.out.println("List after deleting value 10: " + intList);

        // Test with String type
        System.out.println("\nTesting MyList with Strings:");
        MyList<String> stringList = new MyList<>();

        // Add strings
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        System.out.println("String list: " + stringList);

        // Test null values
        System.out.println("\nTesting null values:");
        stringList.add(null);
        System.out.println("After adding null: " + stringList);
        stringList.deleteByValue(null);
        System.out.println("After deleting null: " + stringList);

        // Test shrinking
        System.out.println("\nTesting list shrinking:");
        MyList<Integer> shrinkList = new MyList<>();
        // Add many elements
        for (int i = 0; i < 90; i++) {
            shrinkList.add(i);
        }
        System.out.println("Size after adding 90 elements: " + shrinkList.size());

        // Remove many elements to trigger shrinking
        for (int i = 0; i < 70; i++) {
            shrinkList.deleteByIndex(0);
        }
        System.out.println("Size after removing 70 elements: " + shrinkList.size());
        System.out.println("Remaining elements: " + shrinkList);
    }
}