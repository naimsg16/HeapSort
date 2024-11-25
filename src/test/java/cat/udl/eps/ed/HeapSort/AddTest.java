package cat.udl.eps.ed.HeapSort;

import cat.udl.eps.ed.HeapSort.HeapSort;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static java.util.Comparator.naturalOrder;
import static org.junit.jupiter.api.Assertions.*;

public class AddTest {

    @Test
    void testAddSingleInteger() {
        Integer[] elements = new Integer[10];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());
        heap.add(25);
        assertEquals(25, elements[0]);
    }
    @Test
    void testAddMultipleInteger() {
        Integer[] elements = new Integer[5];
        Integer[] expected = {3069,30,2,25,12}; // ja ordenats com apareixerian si s'afegixin al arbre
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());
        heap.add(25);
        heap.add(30);
        heap.add(2);
        heap.add(3069);
        heap.add(12);
        assertArrayEquals(expected, elements);
    }

    @Test
    void testAddSingleString() {
        String[] elements = new String[10];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());
        heap.add("Mariachi");
        assertEquals("Mariachi", elements[0]);
    }

    @Test
    void testAddMultipleString() {
        String[] elements = new String[5];
        String[] expected = {"hola", "Marioneta", "Trompeta", "Aigua", "Mariachi"};
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());
        heap.add("hola");
        heap.add("Mariachi");
        heap.add("Trompeta");
        heap.add("Aigua");
        heap.add("Marioneta");
        assertArrayEquals(expected, elements);
    }

}


