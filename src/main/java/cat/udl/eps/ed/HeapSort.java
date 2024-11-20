package cat.udl.eps.ed;

import java.util.Arrays;
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
            for(E elem : elements){
                add(elem);
            }
            for(int i = elements.length - 1; i > 0; i--){
                elements[i] = remove();
            }
        }

        void add (E elem){
            elements[heapSize] = elem;
            int elemIndex = heapSize;
            heapSize += 1;
            int parent = parent(elemIndex);
            //si es comprova amb si mateix, ja surt del bucle, per tant, no cal el "parent >= 0"
            while (comparator.compare(elem, elements[parent(elemIndex)]) > 0) {
                swap(elemIndex,parent);
                elemIndex = parent;
                parent = parent(elemIndex);
            }
        }

        E remove () {
            E elem = elements[0];
            elements[0] = elements[heapSize - 1];
            heapSize -= 1;
            int elemIndex = 0;
            int max = maxChild(elemIndex);
            while (max < heapSize && comparator.compare(elements[elemIndex], elements[max]) < 0){
                swap(elemIndex,max);
                elemIndex = max;
                max = maxChild(elemIndex);
            }
            return elem;
        }

        void swap(int i, int j){
            E aux = elements[i];
            elements[i] = elements[j];
            elements[j] = aux;
        }

        int maxChild(int index){
            int left = left(index); int right = right(index);
            if (left >= heapSize) return right;
            if (right >= heapSize) return left;
            if(comparator.compare(elements[left],elements[right]) <= 0) return right;
            else return left;
        }

        int left(int i){ return 2 * i + 1; }
        int right(int i){ return 2 * i + 2; }
        int parent(int i){ return (i - 1) / 2; }

    }
}