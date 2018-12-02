package JavaExercises;

import java.util.Arrays;

public class AnagramsNewLogicWithoutArraysSort {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        char[] aarray = new char[a.length()];
        char[] barray = new char[b.length()];

        for (int i = 0; i < a.length(); i++) {
            aarray[i] = Character.toLowerCase(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            barray[i] = Character.toLowerCase(b.charAt(i));
        }
        //Arrays.sort(aarray);
        //Arrays.sort(barray);

        int counter=0;
        do {
            for (int i = 0; i < aarray.length - 1; i++) {
                if (aarray[i]>(aarray[i + 1])  ) {
                    char placeholder = aarray[i];
                    aarray[i] = aarray[i + 1];
                    aarray[i + 1] = placeholder;
                    counter++;
                }

            } if (counter>0){
                counter=0;
            } else counter=-1;

        } while (counter>=0);
        int counter1=0;
        do {
            for (int i = 0; i < barray.length - 1; i++) {
                if (barray[i]>(barray[i + 1])  ) {
                    char placeholder = barray[i];
                    barray[i] = barray[i + 1];
                    barray[i + 1] = placeholder;
                    counter1++;
                }

            } if (counter1>0){
                counter1=0;
            } else counter1=-1;

        } while (counter1>=0);
        for (char aa:aarray){
            System.out.print(aa+" ");
        }
        for (char aa:barray){
            System.out.print(aa+" ");
        }
        int i=0;
        boolean result=false;
        for (char aa : aarray) {
        if (aarray[i]!=barray[i]){
          result=false;
            break;
        } else {
            result=true;
            i++;
        }
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here

        String a = "bbcc";
        String b = "dabc";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

}
