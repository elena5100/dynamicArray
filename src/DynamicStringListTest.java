import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DynamicStringListTest {

    @Test
    void testAddOneItem() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        assertEquals("A", list.get(0));
    }

    @Test
    void testAddMultipleItems() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("C", list.get(2));
    }
    @Test
    void testSetItem() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.set(0, "Z");
        assertEquals("Z", list.get(0));
    }

    @Test
    void testGetItemAtIndex() {
        DynamicStringList list = new DynamicStringList();
        list.add("X");
        assertEquals("X", list.get(0));
    }
    @Test
    void testRemoveItem() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");
        list.add("C");
        String removed = list.remove(1);
        assertEquals("B", removed);
    }

}