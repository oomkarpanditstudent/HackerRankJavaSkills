package JavaMixedExercises;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
	// write your code here
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    int fullarray[]={1,-2,4,-5,1};
    int count=0;
    for (int num:fullarray){
        if (num<0){
        System.out.println(num);
        count++;
        }
    }
        for (int sum:fullarray){

            if (int num<0){
                System.out.println(num);
                count++;
            }
        }
        System.out.println(count);


    }

}
