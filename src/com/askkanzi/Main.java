package com.askkanzi;

public class Main {

    public static void main(String[] args) {

//        LexigramProduct lexigramProduct = new LexigramProduct.Builder("LANA", "EAT").build();
//        System.out.println("Lexigram product is: " + lexigramProduct);
        // Check if the product matches a correlation
        // if so, then the grammar is verified and the utterance is valid

        Graph theGraph = new Graph();
        theGraph.addVertex('A');    // 0 (start for depth-first search)
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0, 1);         // AB
        theGraph.addEdge(1, 2);         // BC
        theGraph.addEdge(0, 3);         // AD
        theGraph.addEdge(3, 4);         // DE

        System.out.print("Visits: ");
        theGraph.depthFirstSearch();
        System.out.println();

    }   // end main()
}   // end class Main
