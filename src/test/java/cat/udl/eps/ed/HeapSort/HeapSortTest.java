package cat.udl.eps.ed.HeapSort;

import cat.udl.eps.ed.HeapSort.HeapSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeapSortTest {

    @Test
    void SortIntegers() {
        Integer[] elements = {3, 1, 4, 5, 9, 2, 6};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 9};
        HeapSort.sort(elements);
        assertArrayEquals(expected, elements);
    }

    @Test
    void SortStrings() {
        String[] elements = {"Estrella", "Java", "Goku", "Esternoclidomastoïdal", "Ioga"};
        String[] expected = {"Esternoclidomastoïdal", "Estrella", "Goku", "Ioga", "Java"};
        HeapSort.sort(elements);
        assertArrayEquals(expected, elements);
    }

    @Test
    void EmptyArray() {
        Integer[] elements = {};
        Integer[] expected = {};
        HeapSort.sort(elements);
        assertArrayEquals(expected, elements);
    }

    @Test
    void SingleElementArray() {
        Integer[] elements = {42};
        Integer[] expected = {42};
        HeapSort.sort(elements);
        assertArrayEquals(expected, elements);
    }

    @Test
    void DuplicateElements() {
        Integer[] elements = {2, 7, 2, 7, 15, 2, 2, 15, 2, 7, 7, 7, 15};
        Integer[] expected = {2, 2, 2, 2, 2, 7, 7, 7, 7, 7, 15, 15, 15};
        HeapSort.sort(elements);
        assertArrayEquals(expected, elements);
    }

    @Test
    void NegativeNumbers() {
        Integer[] elements = {-69, -90, -5, 4, 0};
        Integer[] expected = {-90, -69, -5, 0, 4};
        HeapSort.sort(elements);
        assertArrayEquals(expected, elements);
    }


}

