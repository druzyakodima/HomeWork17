package task1;

import task1.SwapElement;

public class TestDriveSwapElement {

    public static void main(String[] args) {

        SwapElement<String> swapElement = new SwapElement<>();
        String[] array = {"1", "2", "3", "4", "5"};
        swapElement.swapArray(array);

    }
}
