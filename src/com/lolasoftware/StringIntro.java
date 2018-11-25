package com.lolasoftware;

public class StringIntro {


    public static void main(String[] args) {
        // write your code here

        String FirstString="hello";
        String SecondString="java";

        //Code to copy into HackerRank
//1) First Part

        System.out.println(FirstString.length()+SecondString.length());
//2) Second Part
       if (FirstString.compareTo(SecondString)>0) {
           System.out.println("Yes");
        }
        else if (FirstString.compareTo(SecondString)<0){
           System.out.println("No");
       }

//3) Third Part
        System.out.print(Character.toString(FirstString.charAt(0)).toUpperCase()+FirstString.substring(1)+" ");
        System.out.print(Character.toString(SecondString.charAt(0)).toUpperCase()+SecondString.substring(1)+" ");


    }
}

