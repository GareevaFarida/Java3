package Lesson1.Task3;

public class TestTask3 {
    public static void main(String[] args) {
        Box apple_box = new Box<Apple>(new Apple[]{
                new Apple(),
                new Apple(),
                new Apple()});
        Box orange_box = new Box<Orange>(new Orange[]{
               // new Orange(),
               // new Orange(),
                //new Orange(),
                new Orange(),
                new Orange()});
        System.out.println("Вес коробки с яблоками: "+apple_box.getWeight());
        System.out.println("Вес коробки с апельсинами: "+orange_box.getWeight());
        System.out.println("Вес коробок одинаков: "+apple_box.Compare(orange_box));
    }
}

