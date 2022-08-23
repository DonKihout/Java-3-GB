package ru.gb.lesson1;

public class Orange extends Fruit{
    public Orange(String fruitType) {
        super(fruitType);
    }

    @Override
    public void addFruitToBox(Box box) {
        box.addFruit(this);
    }
}
