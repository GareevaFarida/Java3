package Lesson1.Task3;

public class TestTask3 {
    public static void main(String[] args) {
        Box<Apple> apple_box = new Box<>(new Apple[]{
                new Apple(),
                new Apple(),
                new Apple()});
        Box<Orange> orange_box = new Box<>(new Orange[]{
               // new Orange(),
               // new Orange(),
                //new Orange(),
                new Orange(),
                new Orange()});
        System.out.println("Вес коробки с яблоками: "+apple_box.getWeight());
        System.out.println("Вес коробки с апельсинами: "+orange_box.getWeight());
        System.out.println("Вес коробок одинаков: "+apple_box.Compare(orange_box));

        Box<Orange> orange_box2 = new Box<Orange>(new Orange[]{
                 new Orange(),
                 new Orange(),
                new Orange(),
                new Orange(),
                new Orange()});
        System.out.println("Вес второй коробки с апельсинами до переливания: "+orange_box2.getWeight());
        orange_box.makeEmptyBox(orange_box2);
        System.out.println("Вес второй коробки с апельсинами после переливания: "+orange_box2.getWeight());
        System.out.println("Вес первой коробки с апельсинами после переливания: "+orange_box.getWeight());
        orange_box2.addFruit(new Orange());
        System.out.println("Вес второй коробки с апельсинами после добавления одного фрукта: "+orange_box2.getWeight());
        // orange_box.addFruit(new Apple());

    }
}

