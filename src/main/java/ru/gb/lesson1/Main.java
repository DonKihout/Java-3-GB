package ru.gb.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreateList<Integer> test = new CreateList<>(new Integer[]{2, 1});
        System.out.println(test.changeElementsPositions(0, 1));

        ArrayList<Integer> list = convertArrayToArrayList(test.getList());
        System.out.println(list.getClass());
        
        Apple[] apples = new Apple[]{new Apple("Apple"), new Apple("Apple")};
        Orange[] oranges = new Orange[]{new Orange("Orange"), new Orange("Orange")};
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        for (Apple apple: apples) {
            apple.addFruitToBox(box1);
            apple.addFruitToBox(box3);
        }

        for (Orange orange:oranges) {
            orange.addFruitToBox(box2);
        }

        System.out.println(box1.getWeight() + "\n" + box2.getWeight());
        System.out.println(box1.compare(box2));

        box1.pourTheFruits(box3, 1);
        System.out.println(box3.getWeight());
    }

    public static <T> ArrayList<T> convertArrayToArrayList(T[] array)
    {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }

}
