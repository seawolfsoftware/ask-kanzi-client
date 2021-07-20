package com.askkanzi;

public class HighArray {

    private long[] a;                   // ref to array a
    private int numberOfElements;       // number of data items

    // constructor
    public HighArray(int max){
        a = new long[max];              // create the array
        numberOfElements = 0;           // no items yet
    }   // end constructor


    // find specified value
    public boolean find(long searchKey){
        int j;
        for(j=0; j<numberOfElements;j++)        // for each element,
            if(a[j] == searchKey)               // found item?
                break;                          // exit loop before end
            if(j==numberOfElements)             // gone to end?
                return false;                   // yes, can't find it
            else
                return true;                    // no, found it
    }   // end find()

    // put element into array
    public void insert(long value){
        a[numberOfElements] = value;            // insert it
        numberOfElements++;                     // increment size
    }

    public boolean delete(long value){
        int j;
        for(j=0; j<numberOfElements; j++)       // look for it
            if(value == a[j])
                break;
        if(j==numberOfElements)                 // can't find it
            return false;
        else{                                   // found it
            for(int k=j; k<numberOfElements; k++)   // move higher ones down
                a[k] = a[k+1];
            numberOfElements--;                 // decrement size
            return true;
        }
    }   // end delete()

    // display array contents
    public void display(){
        for(int j=0; j<numberOfElements; j++)   // for each element,
            System.out.print(a[j] + " ");       // display it
        System.out.println("");
    }
}       // end class HighArray
