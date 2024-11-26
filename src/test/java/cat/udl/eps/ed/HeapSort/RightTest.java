package cat.udl.eps.ed.HeapSort;

import org.junit.jupiter.api.Test;

import static java.util.Comparator.naturalOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightTest {
    @Test
    void RightInString() {
        String[] elements = new String[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add("patata");
        heap.add("Penelope");
        heap.add("Catalunya");
        heap.add("Porta");
        heap.add("Armari");

        assertEquals(4, heap.right(1));
    }

    @Test
    void RightInInteger() {
        Integer[] elements = new Integer[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add(25);
        heap.add(30);
        heap.add(2);
        heap.add(3069);
        heap.add(12);

        assertEquals(2, heap.right(0));
    }
}
