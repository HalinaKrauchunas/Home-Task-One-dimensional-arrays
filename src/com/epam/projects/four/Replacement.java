package com.epam.projects.four;

import com.epam.projects.*;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class Replacement {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        InputStreamReader reader = new InputStreamReader (System.in);
        System.out.println ("Enter limit value of numbers in array in array");
        int maxValue = ParseNumber.getPositiveInt (reader);

        int replaceQuantity = 0;
        for (int count = 0; count < arrInt.size (); count++) {
            if (arrInt.get (count) > maxValue) {
                arrInt.set (count, maxValue);
                replaceQuantity += 1;
            }
            System.out.print (arrInt.get (count) + " ");
        }
        System.out.println ("Number of replacements: " + replaceQuantity);
    }
}

