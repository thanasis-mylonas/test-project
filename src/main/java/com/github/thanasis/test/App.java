package com.github.thanasis.test;

import com.google.common.collect.ImmutableSet;

/**
 * Hello world!
 *
 */
public class App 
{


    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main( String[] args )
    {

        ImmutableSet<String> names = ImmutableSet.of("spyros", "thanasis");
        System.out.println( "Hello World!" + names );
    }
}
