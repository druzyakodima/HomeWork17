package task2;

import java.util.ArrayList;
import java.util.Arrays;

public class TransformArrayIntoListTest {

    public static void main(String[] args) {

        TransformArrayIntoList<Double> transformArrayIntoList = new TransformArrayIntoList<>();
        Double[] array = {1.2,2.1,3.6,4.7,5.1};
        transformArrayIntoList.transform(array);

       /* double[] arr = {1.2,2.1,3.6,4.7,5.1}; // это преобразование для определенного типа
        ArrayList<Double> list = new ArrayList<>();
        for (Double e : arr) {
            list.add(e);
        }
        System.out.println(list);*/
    }
}
class TransformArrayIntoList<E> {

    public void transform(E[] arr) {

        ArrayList<E> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        /*for (E element : arr) {
            list.add(element);
        }
        System.out.println(list);*/
    }
}
