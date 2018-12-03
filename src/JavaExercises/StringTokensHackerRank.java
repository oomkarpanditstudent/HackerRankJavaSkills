package JavaExercises;

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringTokensHackerRank {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String names="";
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];



       if (emailID.matches(".*@gmail.com")==true){
           names+=firstName+",";
       }
        }
        String[] saveEmailsAndNames= names.split(",");
        Arrays.sort(saveEmailsAndNames);

        for (String ss:saveEmailsAndNames){
            System.out.println(ss);
        }
        scanner.close();




    }

}
