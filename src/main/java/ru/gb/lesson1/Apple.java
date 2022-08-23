package ru.gb.lesson1;

public class Apple extends Fruit{
    public Apple(String fruitType) {
        super(fruitType);
    }

    @Override
    public void addFruitToBox(Box box) {
        box.addFruit(this);
    }
}
