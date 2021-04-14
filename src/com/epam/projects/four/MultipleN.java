package com.epam.projects.four;

import com.epam.projects.*;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class MultipleN {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        InputStreamReader reader = new InputStreamReader (System.in);
        System.out.print ("What number should the elements be multiples?");
        int multiple = ParseNumber.getPositiveInt (reader);

        System.out.print ("The following numbers are multiples " + multiple + ": ");
        for (Integer integer : arrInt) {
            if (integer % multiple == 0) {
                System.out.print (integer + " ");
            }
        }
    }
}



