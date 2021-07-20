package com.askkanzi;

import java.util.*;

class StringTransposition {

    private static int R = 26;      // alphabet
    private static final int CUTOFF = 15; // cutoff for small subarrays
    private static String[] aux;

    public static void sort(Comparable[] a){ }

    private static void show(Comparable[] a){
        for(int i=0; i< a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1; i< a.length; i++)
            if(less(a[i], a[i-1]))
                return false;
        return true;
    }

    private static int charAt(String s, int d){
        if(d < s.length())
            return s.charAt(d);
        else
            return -1;
    }

    public static void sort(String[] a){
        int n = a.length;
        aux = new String[n];
        sort(a, 0, n-1, 0);
    }

    public static void exchange(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sort(String[] a, int lo, int hi, int d){

        for(int i=lo; i<=hi; i++){
            for(int j=i; j> lo && less(a[j], a[j-1], d); j--)
                exchange(a, j, j-1);
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static boolean less(String v, String w, int d){

        for(int i=d; i<Math.min(v.length(), w.length()); i++){
            if(v.charAt(i) < w.charAt(i))
                return true;
            else if(v.charAt(i) > w.charAt(i))
                return false;
        }
        return v.length() < w.length();
    }

    public static String decodeString(String encodedString) {

        List<String> list = new ArrayList<>(Arrays.asList(encodedString));
        String[] encodedStringOfArrays = list.toArray(new String[]{});

        sort(encodedStringOfArrays);

        System.out.println(Arrays.toString(encodedStringOfArrays));

        StringBuilder b = new StringBuilder();

        for(int i=1; i<encodedString.length() ; i++){
            b.append(String.valueOf(encodedStringOfArrays));
        }

        String decodedString = b.toString();

        System.out.println(decodedString);

//        sort(decodedString);
//        assert isSorted();
//        show(a);

        return decodedString;
    }
}

