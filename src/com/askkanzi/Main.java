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

        int maxSize = 100;                          // array size
        ClassDataArray arr;                         // reference to array
        arr = new ClassDataArray(maxSize);        // create the array

        arr.insert("Selph", "Chaz", 32);
        arr.insert("Roberts", "Anysja", 25);
        arr.insert("Savage-Rumbaugh", "Sue", 74);

        arr.displayArray();              // display items

        String searchKey = "Selph";     // search for item
        Person found;
        found = arr.find(searchKey);

        if(found != null){
            System.out.print("Found ");
            found.displayPerson();
        }
        else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Selph");

        arr.delete("Selph");             // delete an item

        arr.displayArray();                         // display items again

        System.out.println();
    }   // end main()
}   // end class Main
