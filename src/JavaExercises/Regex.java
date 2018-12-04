package JavaExercises;

import java.util.Scanner;

public class Regex {

    public static void main(String[] args) {
	// write your code here


        String s = "He is a very very good boy, isn't he?";
        // Write your code here.
        if (s.trim().length()==0){
            System.out.println(s.trim().length());
        }else {
        String[] result= s.trim().split("[\\S+][ !,?._'@]+");
        System.out.println(result.length);
        for (String ss:result){
            System.out.println(ss);
        }}
    }

}
