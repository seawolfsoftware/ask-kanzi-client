package com.askkanzi;

public class Main {

    public static void main(String[] args) {

        LexigramProduct lexigramProduct = new LexigramProduct.Builder("LANA", "EAT").build();
        System.out.println("Lexigram product is: " + lexigramProduct);

    }
}
