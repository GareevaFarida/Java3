package Lesson1.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(T... mas_fruit) {
        fruits = new ArrayList<>(Arrays.asList(mas_fruit));
    }


    public float getWeight() {
        float boxWeight = 0;
        for (Fruit fr : fruits) {
            boxWeight += fr.getWeight();
        }
        return boxWeight;
    }

    public boolean Compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public void addFruit(T newFruit){
       fruits.add(newFruit);
    }

    public void makeEmptyBox(Box reciever) {
        reciever.fruits.addAll(fruits);
        fruits.removeAll(fruits);
    }

}


