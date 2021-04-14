package com.epam.projects.four;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class CompressArr {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        for (int count = 1; count < arrInt.size (); count += 2) {
            arrInt.set (count, 0);
        }
        System.out.println (arrInt.toString ());
    }
}



