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
    int arraychild=0;
    for (int i=0;i<fullarray.length;i++){
       if (fullarray[i]<0){
        System.out.println(fullarray[i]);
        count++;
        }
    }
        System.out.println(count);

        int total=0;
        for (int i=0;i<fullarray.length;i++){
           total+=fullarray[i];
             //  System.out.println("total for loop full for now in this run"+total);
        }
        if (total<0){
            System.out.println("BEfore COUNT "+count);
            System.out.println("BEfore Total "+total);
            count++;
            System.out.println("After COUNT "+count);
        }
        System.out.println(total);
        System.out.println(count);
         total=0;
         int move=1;
        for (int i=0;i<fullarray.length-move;i++){
            total+=fullarray[i]+fullarray[i+move];
           // System.out.println(total);
           // System.out.println(count);
            if (total<0){
                System.out.println("Before COUNT "+count);
                System.out.println("Before Total "+total);
                count++;
                System.out.println("After COUNT "+count);
            total=0;
            }
            total=0;

        }

         System.out.println("Till now = "+count);
        total=0;
        int move2=2;
        for (int i=0;i<fullarray.length-move2;i++){
            total+=fullarray[i]+fullarray[i+move]+fullarray[i+move2];
         //   System.out.println("loop "+i+total);

            if (total<0){
                System.out.println("Before COUNT "+count);
                System.out.println("Before Total "+total);
                count++;
                System.out.println("After COUNT "+count);
                total=0;

            }
            total=0;
            // System.out.println(total);
        }
        total=0;
      int  move3=3;
        for (int i=0;i<fullarray.length-move3;i++){
            total+=fullarray[i]+fullarray[i+move]+fullarray[i+move2]+fullarray[i+move3];
            //   System.out.println("loop "+i+total);

            if (total<0){
                System.out.println("Before COUNT "+count);
                System.out.println("Before Total "+total);
                count++;
                System.out.println("After COUNT "+count);
                total=0;

            }
            total=0;
            // System.out.println(total);
        }

        // System.out.println(total);
        System.out.println("final count "+count);
    }

}
