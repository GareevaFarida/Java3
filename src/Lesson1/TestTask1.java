package Lesson1;

import java.util.Arrays;

public class TestTask1 {

    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3", "4", "5"};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        HomeWork.task1(arr1,0,1);
        HomeWork.task1(arr2,0,4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

