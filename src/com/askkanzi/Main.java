package com.askkanzi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int index = 0;
        for (LexigramClasses lexigramClass : LexigramClasses.values()) {
            System.out.printf("Lexigram class %d represents %s with a color of %s and classes of %s %n",
                                index,
                                lexigramClass,
                                lexigramClass.getColor(),
                                Arrays.toString(lexigramClass.getClasses()));
            index++;
        }



    }   // end main()
}   // end class Main
