package com.askkanzi;

public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[];        // array of vertices
    private int adjMat[][];             // adjacency matrix
    private int numberOfVertices;       // current number of vertices
    private char sortedArray[];
    private StackX theStack;
    private Queue theQueue;


    // constructor
    public Graph(){
        vertexList = new Vertex[MAX_VERTS];

        adjMat = new int[MAX_VERTS][MAX_VERTS]; // adjacency matrix
        numberOfVertices = 0;

        for(int j=0; j<MAX_VERTS; j++)  // set adjacency matrix to 0
            for(int k=0; k<MAX_VERTS; k++)  // matrix to 0
                adjMat[j][k] = 0;
        sortedArray = new char[MAX_VERTS];  // sorted vertex labels
        theStack = new StackX();
//        theQueue = new Queue();
    }   // end constructor

    // argument is label
    public void addVertex(char lab){
        vertexList[numberOfVertices++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
//        adjMat[end][start] = 1; uncomment to use un-directed graph, commented out for topological sort
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public void deleteVertex(int delVert){
        if(delVert != numberOfVertices-1){                  // if not last vertex,
            for(int j=delVert; j<numberOfVertices-1; j++)   // delete from vertexList
                vertexList[j] = vertexList[j+1];

            // delete row from adjacency matrix
            for(int row=delVert; row<numberOfVertices-1; row++)
                moveRowUp(row, numberOfVertices);

            // delete column from adjacency matrix
            for(int col=delVert; col<numberOfVertices-1; col++)
                moveColLeft(col, numberOfVertices-1);
        }
        numberOfVertices--;                                 // one less vertex
    }   // end deleteVertex


    private void moveRowUp(int row, int length){
        for(int col=0; col<length; col++)
            adjMat[row][col] = adjMat[row+1][col];
    }

    private void moveColLeft(int col, int length){
        for(int row=0; row<length; row++)
            adjMat[row][col] = adjMat[row][col+1];
    }

    // returns an unvisited vertex adj to v
    public int getAdjUnvisitedVertex(int v){
        for(int j = 0; j< numberOfVertices; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j;
        return -1;
    }   // end getAdjUnvisitedVertex()

    // depth-first search
    public void depthFirstSearch(){
        vertexList[0].wasVisited = true;     // mark it
        displayVertex(0);                 // display it
        theStack.push(0);                 // push it

        // until stack is empty,
        while(!theStack.isEmpty()){

            // get an unvisited vertex adjacent to stack top
            int v = getAdjUnvisitedVertex(theStack.peek());
            if(v == -1)                             // if no such vertex,
                theStack.pop();
            else{                                   // if it exists,
                vertexList[v].wasVisited = true;    // mark it
                displayVertex(v);                   // display it
                theStack.push(v);                   // push it
            }
        }   // end while

        // stack is empty, so we're done
        for(int j = 0; j< numberOfVertices; j++)         // reset flags
            vertexList[j].wasVisited = false;
    }   // end dfs


    // breadth-first search
    public void breadthFirstSearch(){
                                            // begin at vertex 0
        vertexList[0].wasVisited = true;    // mark it
        displayVertex(0);                // display it
        theQueue.insert(0);                             // insert at tail
        int v2;

        while(!theQueue.isEmpty()){         // until queue is empty,
            int v1 = theQueue.remove();     // remove vertex at head until it has no unvisited neighbors
            while((v2=getAdjUnvisitedVertex(v1)) != -1){    // get one
                vertexList[v2].wasVisited = true;           // mark it
                displayVertex(v2);                          // display it
                theQueue.insert(v2);                        // insert it
            }   // end while
        }   // end while (queue not empty)

        // queue is empty, so we're done
        for(int j = 0; j< numberOfVertices; j++)             // reset flags
            vertexList[j].wasVisited = false;
    }   // end bfs

    // minimum spanning tree (depth first)
    public void minimumSpanningTree(){
                                                     // start at vertex 0
        vertexList[0].wasVisited = true;            // mark it
        theStack.push(0);                         // push it

        while(!theStack.isEmpty()){                 // until stack empty

            int currentVertex = theStack.peek();    // get stack top
            int v = getAdjUnvisitedVertex(currentVertex);   // get next unvisited neighbor

            if(v == -1)                               // if no more neighbors
                theStack.pop();                     // pop it away
            else {                                   // got a neighbor
                vertexList[v].wasVisited = true;    // mark it
                theStack.push(v);                   // push it

                displayVertex(currentVertex);       // display edge from currentVertex to v
                displayVertex(v);

                System.out.print(" ");
            }
        }   // end while(stack not empty)

        // stack is empty, so we're done
        for(int j = 0; j< numberOfVertices; j++)             // reset flags
            vertexList[j].wasVisited = false;
    }   // end tree

    public void topologicalSort(){
        int orig_numberOfVertices = numberOfVertices;       // remember how many vertices

        // while vertices remain,
        while(numberOfVertices>0){
            // get a vertext with no successors, or -1
            int currentVertex = noSuccessors();
            if(currentVertex == -1){            // must be a cycle
                System.out.println("ERROR: Graph has cycles");
                return;
            }
            // insert vertext label in sorted array (start at end)
            sortedArray[numberOfVertices-1] = vertexList[currentVertex].label;

            deleteVertex(currentVertex);           // delete vertex
        }   // end while

        // vertices all gone; display sortedArray
        System.out.print("Topologically sorted order: ");
        for(int j=0; j<orig_numberOfVertices; j++)
            System.out.print(sortedArray[j]);
        System.out.println("");
    }   // end topologicalSort

    public int noSuccessors(){          // returns vert with no successors (or -1 if no such vertices)
        boolean isEdge;                 // edge from row to column in adjMat

        for(int row=0; row<numberOfVertices; row++){    // for each vertex,
            isEdge = false;                             // check edges

            for(int col=0; col<numberOfVertices; col++){
                if(adjMat[row][col] > 0){               // if edge to another,
                    isEdge = true;
                    break;                              // this vertex has a successor
                }
            }                                           // try another
            if(!isEdge)                                 // if no edges,
                return row;                             // has no successors
        }
        return -1;                                      // no such vertex
    }   // end noSuccessors
}// end class Graph
