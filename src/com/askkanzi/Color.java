package com.askkanzi;

public enum Color {

    RED(0),
    ORANGE(1),
    YELLOW(2),
    GREEN(3),
    BLACK(4),
    BLUE(5),
    BLUEGREY(6),
    INDIGO(7),
    VIOLET(8),
    WHITE(9);

    private int value;

    private Color(){}

    private Color(int i){
        this.value = i;
    }

    //define instance method
    public void printValue(){
        System.out.println(this.value);
    }
}