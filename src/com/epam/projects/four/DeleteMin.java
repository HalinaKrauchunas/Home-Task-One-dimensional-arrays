package com.epam.projects.four;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class DeleteMin {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        arrInt.sort (Integer::compareTo);
        Integer min = arrInt.get (0);

        for (int a = 0; a < arrInt.size (); a++) {
            arrInt.remove (min);
        }
        arrInt.remove (min);
        System.out.println (arrInt);
    }
}

