package com.askkanzi;

public class OrderedArray {

    private long[] a;                   // ref to array a
    private int numberOfElements;       // number of data items

    // constructor
    public OrderedArray(int max){

        a = new long[max];              // create the array
        numberOfElements = 0;           // no items yet

    }   // end constructor

    public int size(){
        return numberOfElements;
    }

    // find specified value
    public int find(long searchKey){
//        int j;
//        for(j=0; j<numberOfElements;j++)        // for each element,
//            if(a[j] == searchKey)               // found item?
//                break;                          // exit loop before end
//            if(j==numberOfElements)             // gone to end?
//                return false;                   // yes, can't find it
//            else
//                return true;                    // no, found it

        // binary search find()
        int lowerBound = 0;
        int upperBound = numberOfElements-1;
        int curIn;

        while(true){
            curIn = (lowerBound + upperBound) / 2;

            if(a[curIn] == searchKey)
                return curIn;                       // found it
            else if(lowerBound > upperBound)
                return numberOfElements;            // can't find it
            else{
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1;         // it's in upper half
                else
                    upperBound = curIn - 1;         // it's in lower half
            }   // end else divide range
        }   // end while
    }   // end find()

    // put element into array
    public void insert(long value){

        int j;
        for(j=0; j<numberOfElements; j++)           // find where it goes
            if(a[j] > value)                        // linear search
                break;
        for(int k=numberOfElements; k>j; k--)       // move bigger ones up
            a[k] = a[k-1];
        a[j] = value;                               // insert it
        numberOfElements++;                         // increment size
    }   // end insert()

    public boolean delete(long value){

        int j = find(value);
        if(j==numberOfElements)                     // can't find it
            return false;
            else {                                  // found it
                for(int k=j; k<numberOfElements; k++)   // move bigger ones down
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
}   // end class HighArray
