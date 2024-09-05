import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorSpec {
    private StringListProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new StringListProcessor();
    }

    @Test
    void testAddString() {
        processor.addString("Hello");
        processor.addString("World");
        assertEquals(2, processor.getSize(), "Size should be 2 after adding two strings");
    }



    @Test
    void testRemoveString() {
        processor.addString("Hello");
        processor.addString("World");
        boolean removed = processor.removeString("Hello");
        assertTrue(removed, "The string 'Hello' should be removed successfully");
        assertEquals(1, processor.getSize(), "Size should be 1 after removing one string");

        removed = processor.removeString("NonExistent");
        assertFalse(removed, "Removing a non-existent string should return false");
        assertEquals(1, processor.getSize(), "Size should remain 1 after trying to remove a non-existent string");

    }

    @Test
    void testGetString() {
        processor.addString("Hello");
        processor.addString("World");
        String str = processor.getString(0);
        assertEquals("Hello", str, "The first element should be 'Hello'");


        str = processor.getString(1);
        assertEquals("World", str, "The second element should be 'World'");
    }



    @Test
    void testGetStringWithInvalidIndex() {
        processor.addString("Hello");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            processor.getString(0);
        }, "Getting an element with an invalid index should throw an IndexOutOfBoundsException");
    }



    @Test

    void testGetSize() {

        assertEquals(0, processor.getSize(), "Size should be 0 for an empty list");



        processor.addString("Hello");

        assertEquals(1, processor.getSize(), "Size should be 1 after adding one string");



        processor.addString("World");

        assertEquals(2, processor.getSize(), "Size should be 2 after adding two strings");



        processor.removeString("Hello");

        assertEquals(1, processor.getSize(), "Size should be 1 after removing one string");

    }
}
