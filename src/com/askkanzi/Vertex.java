package com.askkanzi;

public class Vertex {

    public char label;          // label (e.g. 'A')
    public boolean wasVisited;
    public boolean isInTree;

    // constructor
    public Vertex(char lab){
        label = lab;
        wasVisited = false;
        isInTree = false;
    }   // end constructor
}
