package com.askkanzi;

public class Vertex {

    public char label;          // label (e.g. 'A')
    public boolean wasVisited;

    // constructor
    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }   // end constructor
}
