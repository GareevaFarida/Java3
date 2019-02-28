package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

class HomeWork {
    static <T> void task1(T[] arr, int i,int j) {
        if (i==j) return;
        T oldValue = arr[i];
        arr[i] = arr[j];
        arr[j] = oldValue;
    }

    static <T> ArrayList<T> task2(T[] mas){
        ArrayList<T> arrayList =  new ArrayList<>(Arrays.asList(mas));
        return arrayList;
    }
}
