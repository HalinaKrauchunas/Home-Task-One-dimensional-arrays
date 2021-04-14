package com.epam.projects.four;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class ParamCalculation {

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");
        ArrayList<Integer> arrInt = newArrayInt ();

        int positive = 0, negative = 0, zeros = 0;

        for (Integer integer : arrInt) {
            if (integer > 0) {
                positive += 1;
            } else if (integer < 0) {
                negative += 1;
            } else {
                zeros += 1;
            }
        }
        System.out.println (positive + " " + negative + " " + zeros);
    }
}