package com.epam.projects.four;

import java.util.*;

import static com.epam.projects.FilingArr.*;

public class MostCommonNumb {

    public MostCommonNumb() {}

    public static void main(String[] args) throws Exception {

        System.out.println ("Determine the number of elements in the array and then fill it");

        ArrayList<Integer> integers = newArrayInt ();

        HashMap<Integer, Integer> map = new HashMap<> ();
        for (Integer number : integers) {
            if (!map.containsKey (number)) {
                map.put (number, 1);
            } else {
                int currentValue = map.get (number);
                map.put (number, currentValue + 1);
            }
        }
        System.out.println (map.entrySet ().stream ().max (Map.Entry.comparingByValue ()));
    }
}

