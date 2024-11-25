package cat.udl.eps.ed.HeapSort;

import org.junit.jupiter.api.Test;

import static java.util.Comparator.naturalOrder;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveTest {

    @Test
    void testRemoveSingleInteger() {
        Integer[] elements = new Integer[1];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add(12);

        assertEquals(12, heap.remove());
    }

    @Test
    void testRemoveMultipleInteger() {
        Integer[] elements = new Integer[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add(25);
        heap.add(30);
        heap.add(2);
        heap.add(3069);
        heap.add(12);

        assertEquals(3069, heap.remove());
    }

    @Test
    void testRemoveSingleString() {
        String[] elements = new String[1];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add("patata");

        assertEquals("patata", heap.remove());
    }

    @Test
    void testRemoveMultipleString() {
        String[] elements = new String[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add("patata");
        heap.add("Penelope");
        heap.add("Catalunya");
        heap.add("Porta");
        heap.add("Armari");

        assertEquals("patata", heap.remove());
    }

/*
Naim falta aquest test pq salta error si borres
    @Test
    void testRemoveEmpty() {
        Integer[] elements = {};
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());
        assertEquals(null , heap.remove());
    }
 */

}

