package GenericMyListImplemenation;

public class MyList<T> {
    private T[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 100;
    private static final int GROWTH_FACTOR = 2;
    private static final double SHRINK_THRESHOLD = 0.25;

    public MyList() {
        // We can't create a generic array directly, so we need to cast Object[] to T[]
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // Add a new value to the list
    public void add(T value) {
        if (size == array.length) {
            resize(array.length * GROWTH_FACTOR);
        }
        array[size++] = value;
    }

    // Delete element at specified index
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // Shift elements to fill the gap
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Clear the last element to prevent memory leak
        array[size - 1] = null;
        size--;

        // Shrink array if necessary
        if (size > 0 && size < array.length * SHRINK_THRESHOLD) {
            resize(Math.max(INITIAL_CAPACITY, array.length / GROWTH_FACTOR));
        }
    }

    // Delete first occurrence of specified value
    public void deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            // Handle null values properly
            if ((value == null && array[i] == null) ||
                    (value != null && value.equals(array[i]))) {
                deleteByIndex(i);
                return;
            }
        }
    }

    // Get value at specified index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    // Get current size of the list
    public int size() {
        return size;
    }

    // Resize array to new capacity
    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // For debugging/testing purposes
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}