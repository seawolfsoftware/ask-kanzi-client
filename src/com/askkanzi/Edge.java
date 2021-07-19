package com.askkanzi;

public class Edge {
    public int sourceVertex;        // index of a vertex starting edge
    public int destinationVertex;   // index of a vertex ending edge
    public int distance;            // distance from source to destination

    // constructor
    public Edge(int sv, int dv, int d){
        sourceVertex = sv;
        destinationVertex = dv;
        distance = d;
    }
}   // end class Edge
