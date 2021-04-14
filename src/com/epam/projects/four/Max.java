package com.epam.projects.four;
//в массиве из 8 элементов найти максимум (а1+а8, а2+а7, а3+а6, а4+а5).

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class Max {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        ArrayList<Integer> sumNumbers = new ArrayList<> ();
        int len = arrInt.size ();
        for (int a = 0; a < arrInt.size (); a++, len--) {
            sumNumbers.add ((arrInt.get (a) + arrInt.get (len - 1)));
            sumNumbers.sort (Collections.reverseOrder ());
        }
        System.out.println (sumNumbers.get (0));
    }
}


