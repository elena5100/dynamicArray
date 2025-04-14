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
    @Test
    void testRemoveShiftsItemsLeft() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove(0);
        assertEquals("B", list.get(0));
    }

    @Test
    void testSizeAfterAdd() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");
        assertEquals(2, list.size());
    }

    @Test
    void testSizeAfterRemove() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        list.add("B");
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    void testInitialCapacity() {
        DynamicStringList list = new DynamicStringList();
        assertEquals(10, list.capacity());
    }

    @Test
    void testCapacityAfterResize() {
        DynamicStringList list = new DynamicStringList(2);
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(4, list.capacity());
    }
    @Test
    void testGetInvalidIndexThrowsException() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    void testSetInvalidIndexThrowsException() {
        DynamicStringList list = new DynamicStringList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(2, "X"));
    }

    @Test
    void testRemoveInvalidIndexThrowsException() {
        DynamicStringList list = new DynamicStringList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    void testAddBeyondInitialCapacityKeepsItems() {
        DynamicStringList list = new DynamicStringList(2);
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("C", list.get(2));
    }

    @Test
    void testSetMultipleTimes() {
        DynamicStringList list = new DynamicStringList();
        list.add("One");
        list.set(0, "Two");
        list.set(0, "Three");
        assertEquals("Three", list.get(0));
    }

}