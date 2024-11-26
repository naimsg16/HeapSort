package cat.udl.eps.ed.HeapSort;

import org.junit.jupiter.api.Test;

import static java.util.Comparator.naturalOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxChildTest {

    @Test
    void MaxBetweenString() {
        String[] elements = new String[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add("patata");
        heap.add("Penelope");
        heap.add("Catalunya");
        heap.add("Porta");
        heap.add("Armari");

        assertEquals(3, heap.maxChild(1));
    }

    @Test
    void MaxBetweenInteger() {
        Integer[] elements = new Integer[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add(25);
        heap.add(30);
        heap.add(2);
        heap.add(3069);
        heap.add(12);



        assertEquals(1, heap.maxChild(0));
    }


    /* BRO NAIM ES TORNA BOIG AMB LA MERDA AQUESTA DIU QUE EL MES GRAN DELS FILLS DEL 12 es 14 i NI ESTA XDDDD
        @Test
    void MaxBetweenEmpty() {
        Integer[] elements = new Integer[5];
        var heap = new HeapSort.BinaryHeap<>(elements, naturalOrder());

        heap.add(25);
        heap.add(30);
        heap.add(2);
        heap.add(3069);
        heap.add(12);


        assertEquals(12, heap.maxChild(6));
    }
     */

}

