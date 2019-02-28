package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTask2 {

    public static void main(String[] args) {
        String[] mas = {"1", "2", "3", "4", "5"};
        ArrayList<String> arr = HomeWork.task2(mas);
        System.out.println(arr);

        Float[] floats = {1.0f,2.0f,3.3f,4.5f};
        ArrayList<Float> floatArrayList = HomeWork.task2(floats);
        System.out.println(floatArrayList);

    }
}
