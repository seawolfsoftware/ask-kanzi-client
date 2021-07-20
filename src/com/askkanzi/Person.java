package com.askkanzi;

public class Person {

    private String lastName;
    private String firstName;
    private int age;


    // constructor
    public Person(String last, String first, int a){

        lastName = last;
        firstName = first;
        age = a;

    }   // end constructor

    public void displayPerson(){
        System.out.print("Last Name: " + lastName);
        System.out.print(", First Name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLastName(){            // key field used for searches
        return lastName;
    }
}
