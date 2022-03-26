package task1;

import java.util.Arrays;

public class SwapElement<E> {

    public void swapArray(E[] array) {

        E element = array[1];
        array[1] = array[2];
        array[2] = element;

        System.out.println(Arrays.toString(array));
    }
}
