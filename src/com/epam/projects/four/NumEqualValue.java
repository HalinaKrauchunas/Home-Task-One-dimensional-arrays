package com.epam.projects.four;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class NumEqualValue {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        for (int count = 0; count < arrInt.size (); count++) {
            if (arrInt.get (count) > count) {
                System.out.print (arrInt.get (count));
            }
        }
    }
}
//        if i - number elements in array
