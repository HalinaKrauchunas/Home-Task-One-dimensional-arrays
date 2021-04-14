package com.epam.projects.four;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class Swap {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        arrInt.sort (Integer::compareTo);
        String min = arrInt.get (0).toString ();
        String max = arrInt.get (arrInt.size () - 1).toString ();

        System.out.println (arrInt.toString ().replaceAll (max, min));
    }
}
