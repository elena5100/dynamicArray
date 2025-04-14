public class DynamicStringList implements StringList {
    private String[] items = new String[10]; 
    private int count = 0;

    // Get item at position
    public String get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return items[index];
    }

    // Change item at position
    public void set(int index, String value) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        items[index] = value;
    }

    // Add item to end
    public void add(String value) {
        if (count == items.length) {
            String[] newItems = new String[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = value;
        count++;
    }

    // Remove item from list
    public String remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        String removed = items[index];
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1]; // move items left
        }
        items[count - 1] = null;
        count--;
        return removed;
    }

    public int size() {
        return count;
    }

    public int capacity() {
        return items.length;
    }
}
