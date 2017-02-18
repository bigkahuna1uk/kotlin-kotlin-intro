package com.chriskelly.kotlincourse.basics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ListExampleGenerator
 *
 * @author bigkahuna
 * @since 18/02/2017
 */
public class ListExampleGenerator {

    public List aList()
    {
        List<String> list = Arrays.asList("1", "2", "3", "4", "a");

        List<String> accum = new ArrayList();

        for(String s : list)
        {
            accum.add(s.toUpperCase());
        }

        return accum;
    }

}
