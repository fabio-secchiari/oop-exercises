package org.example.oop.basic;

public class ClickCounter {
    int value;

    public ClickCounter() { }

    public int getValue(){
        return value;
    }

    public void click(){
        value++;
    }

    public void undo(){
        value = value >= 1 ? value-1 : 0;
    }

    public void reset(){
        value = 0;
    }

}
