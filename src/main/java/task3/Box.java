package task3;

import java.util.ArrayList;

class TestBox {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.putBox(new Apple());
        appleBox.putBox(new Apple());
        appleBox.putBox(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.putBox(new Orange());
        orangeBox.putBox(new Orange());
        orangeBox.putBox(new Orange());

        System.out.println("Weight orange = " + orangeBox.getWeight());
        System.out.println("Weight apple = " + appleBox.getWeight());

        System.out.println("\nThe boxes weigh the same: " + orangeBox.compare(appleBox));

        Box<Apple> boxApple = new Box<>();
        boxApple.putBox(new Apple());
        boxApple.putBox(new Apple());
        boxApple.putBox(new Apple());
        boxApple.putBox(new Apple());

        System.out.println("\nWeight boxApple = " + boxApple.getWeight());
        System.out.println("Weight appleBox = " + appleBox.getWeight());

        appleBox.transferFruit(boxApple);

        System.out.println("Weight boxApple = " + boxApple.getWeight());
        System.out.println("Weight appleBox = " + appleBox.getWeight());

        Box<Orange> boxOrange = new Box<>();
        boxOrange.putBox(new Orange());
        boxOrange.putBox(new Orange());
        boxOrange.putBox(new Orange());

        System.out.println("\nWeight boxOrange = " + boxOrange.getWeight());
        System.out.println("Weight orangeBox = " + orangeBox.getWeight());
        boxOrange.transferFruit(orangeBox);

        System.out.println("Weight boxOrange = " + boxOrange.getWeight());
        System.out.println("Weight orangeBox = " + orangeBox.getWeight());

    }
}

class Box<E extends Fruit> {

    ArrayList<E> boxFruit = new ArrayList<>();

    public void putBox(E e) {
        boxFruit.add(e);
    }

    public float getWeight() {
        float sumWeight = 0.0f;
        for (E value : boxFruit) {
            sumWeight += value.getWEIGHT();
        }
        return sumWeight;
    }

    public boolean compare(Box<?> box) {
        return box.getWeight() == getWeight();
    }

    public void transferFruit(Box<E> box) {
        System.out.println("Shifted the fruit");
        for (E fruit : boxFruit) {
            box.putBox(fruit);
        }
        boxFruit.clear();
    }
}

