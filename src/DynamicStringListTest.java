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
}