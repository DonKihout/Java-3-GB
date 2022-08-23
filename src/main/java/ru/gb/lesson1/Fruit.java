package ru.gb.lesson1;

public abstract class Fruit {
    private String fruitType;

    public Fruit(String fruitType) {
        this.fruitType = fruitType;
    }

    public abstract void addFruitToBox(Box box);

    public String getFruitType(){
        return fruitType;
    };

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }


}
