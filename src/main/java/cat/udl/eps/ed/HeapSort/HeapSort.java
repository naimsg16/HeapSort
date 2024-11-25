package cat.udl.eps.ed.HeapSort;

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
                elements[i] = remove(0);
            }
        }

        void add (E elem){
            elements[heapSize] = elem;
            int elemIndex = heapSize;
            heapSize++;
            int parent = parent(elemIndex);
            while (parent >= 0 && comparator.compare(elem, elements[parent(elemIndex)]) > 0) {
                swap(elemIndex,parent);
                elemIndex = parent;
                parent = parent(elemIndex);
            }
        }

        E remove (int start) {
            E elem = elements[0];
            //if(start == heapSize-1) return elem;
            elements[0] = elements[heapSize - 1];
            heapSize--;
            int elemIndex = 0;
            int left = left(elemIndex);
            int right = right(elemIndex);
            int max = max(left,right);
            while (max < heapSize && comparator.compare(elements[elemIndex], elements[max]) < 0){
                swap(elemIndex,max);
                elemIndex = max;
                max = max(left(elemIndex), right(elemIndex));
            }
            return elem;
        }

        void swap(int i, int j){
            E aux = elements[i];
            elements[i] = elements[j];
            elements[j] = aux;
        }

        int max(int i, int j){
            if (i >= heapSize) return j;
            if (j >= heapSize) return i;
            if(comparator.compare(elements[i],elements[j]) < 0) return j;
            if(comparator.compare(elements[i],elements[j]) == 0) return j;
            else return i;
        }

        int left(int i){
            return 2 * i + 1;
        }
        int right(int i){
            return 2 * i + 2;
        }
        int parent(int i){
            if(i == 0) return -1;
            return (i - 1)/2;
        }

        //TODO: Implementar resta del Binary Heap
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,4,10,1,2,10,8,7,5,3,6,9};
        HeapSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}