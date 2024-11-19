package cat.udl.eps.ed;

import java.util.Comparator;

public class HeapSort {
    public static <E> void sort(
            E[] elements, Comparator<? super E> cmp) {
        new BinaryHeap<>(elements, cmp).heapSort();
    }
    public static <E extends Comparable<? super E>> void sort(
            E[] elements) {
        sort(elements, Comparator.naturalOrder());
    }
    static class BinaryHeap<E> {
        final E[] elements;
        final Comparator<? super E> comparator;
        int heapSize;

        BinaryHeap(E[] elements, Comparator<? super E> comparator) {
            this.elements = elements;
            this.comparator = comparator;
            this.heapSize = 0;
        }
        void heapSort() {
            //TODO: Implementar HeapSort
        }

        //TODO: Implementar resta del Binary Heap
    }
}