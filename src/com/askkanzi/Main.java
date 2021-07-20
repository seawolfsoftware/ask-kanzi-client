package com.askkanzi;

public class Main {

    public static void main(String[] args) {

//        Graph theGraph = new Graph();
//        theGraph.addVertex('A');    // 0 (start for depth-first search), (start for minimum-spanning-tree)
//        theGraph.addVertex('B');    // 1
//        theGraph.addVertex('C');    // 2
//        theGraph.addVertex('D');    // 3
//        theGraph.addVertex('E');    // 4
//        theGraph.addVertex('F');    // 5
//        theGraph.addVertex('G');    // 6
//        theGraph.addVertex('H');    // 7
//
//        theGraph.addEdge(0, 3);         // AD
//        theGraph.addEdge(0, 4);         // AE
//        theGraph.addEdge(1, 4);         // BE
//        theGraph.addEdge(2, 5);         // CF
//        theGraph.addEdge(3, 6);         // DG
//        theGraph.addEdge(4, 6);         // EG
//        theGraph.addEdge(5, 7);         // FH
//        theGraph.addEdge(6, 7);         // GH
//
////        System.out.print("Visits: ");
////        theGraph.depthFirstSearch();
////        theGraph.breadthFirstSearch();
////        System.out.print("Minimum spanning tree: ");
////        theGraph.minimumSpanningTree();
//
//        theGraph.topologicalSort();

        int maxSize = 100;          // array size
        HighArray arr;              // reference to array
        arr = new HighArray((maxSize));     // create the array

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();              // display items

        int searchKey = 35;         // search for item

        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();              // display items again


        System.out.println();
    }   // end main()
}   // end class Main
