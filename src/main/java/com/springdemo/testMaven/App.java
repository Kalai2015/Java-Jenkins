package com.springdemo.testMaven;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World using Docker with second commit " );
        
        Integer[] arr =  {2,4,5,1,8};
        List<Integer> list = Arrays.asList(arr);
        
        System.out.println("List content : "+list);
    }
}
