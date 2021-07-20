package com.askkanzi;

public class ClassDataArray {

    private Person[] a;             // reference to array
    private int numberOfElements;   // number of data items


    // constructor
    public ClassDataArray(int max){

        a = new Person[max];        // create the array
        numberOfElements = 0;       // no items yet

    }   // end constructor


    // find specified value
    public Person find(String searchName){

        int j;
        for(j=0; j<numberOfElements; j++)                   // for each element,
            if( a[j].getLastName().equals(searchName) )     // found item?
                break;                                      // exit loop before end
       if(j == numberOfElements)                            // gone to end?
           return null;                                     // yes, can't find it
       else
           return a[j];                                     // no, found it
    }   // end find


    // put person into array
    public void insert(String last, String first, int age){
        a[numberOfElements] = new Person(last, first, age);
        numberOfElements++;                                 // increment size
    }

    // delete person from array
    public boolean delete(String searchName){

        int j;
        for(j=0; j<numberOfElements; j++)                   // look for it
            if( a[j].getLastName().equals(searchName) )
                break;
        if(j== numberOfElements)                            // can't find it
            return false;
        else{                                               // found it
            for(int k=j; k<numberOfElements; k++)           // shift down
                a[k] = a[k+1];
            numberOfElements--;                             // decrement size
            return true;
        }
    }       // end delete()


    // displays array contents
    public void displayArray(){
        for(int j=0; j<numberOfElements; j++)               // for each element,
            a[j].displayPerson();                           // display it
    }


}       // end class ClassDataArray
