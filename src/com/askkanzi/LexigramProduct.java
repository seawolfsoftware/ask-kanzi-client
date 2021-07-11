package com.askkanzi;

public class LexigramProduct {

    private final String lexigramOne;
    private final String lexigramTwo;

    public static class Builder {

        // Required parameters
        private final String lexigramOne;
        private final String lexigramTwo;

        // Optional parameters - initialized to default values

        public Builder(String lexigramOne, String lexigramTwo) {
            this.lexigramOne = lexigramOne;
            this.lexigramTwo = lexigramTwo;
        }

        public LexigramProduct build() {
            return new LexigramProduct(this);
        }
    }

    private LexigramProduct(Builder builder) {
        lexigramOne = builder.lexigramOne;
        lexigramTwo = builder.lexigramTwo;
    }
}