package ru.gb.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateList <T> {
    private T[] list;

    public CreateList(T[] list) {
        this.list = list;
    }

    public String changeElementsPositions(int pos1, int pos2){
        try {
            T bufferElement =  this.list[pos1];
            this.list[pos1] = list[pos2];
            this.list[pos2] = bufferElement;
            return "list=" + Arrays.toString(list);
        } catch (IndexOutOfBoundsException e){
            return e.getMessage();
        }
    }

    @Override
    public String toString() {
        return "list=" + Arrays.toString(list);
    }

    public T[] getList() {
        return list;
    }
}
