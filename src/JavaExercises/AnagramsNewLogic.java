package JavaExercises;

import java.util.Arrays;

public class AnagramsNewLogic {

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
        Arrays.sort(aarray);
        Arrays.sort(barray);
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
