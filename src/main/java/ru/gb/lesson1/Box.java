package ru.gb.lesson1;

import java.util.ArrayList;
import java.util.Objects;

public class Box {
    private String fruitType;
    private boolean emptyBox = true;
    private ArrayList<Fruit> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit){
        if(this.emptyBox || Objects.equals(this.fruitType, fruit.getFruitType())){
            this.fruitType = fruit.getFruitType();
            this.emptyBox = false;
            fruits.add(fruit);
        }
    }

    public void pourTheFruits(Box secondBox, int count){
        if (secondBox.emptyBox || Objects.equals(this.fruitType, secondBox.fruitType)){
            for (int i = 0; i < count; i++) {
                secondBox.fruits.add(this.fruits.get(i));
                this.fruits.remove(i);
                secondBox.setFruitType(this.fruitType);
                System.out.println("Фрукты переложены");
            }
        } else {
            System.out.println("В корзине лежат другие фрукты!");
        }
    }
    public float getWeight(){
        if(Objects.equals(fruitType, "Apple")) return fruits.size() * 1.0f;
        return fruits.size() * 1.5f;
    }
    public Boolean compare(Box box){
        return box.getWeight() == this.getWeight();
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }
}
