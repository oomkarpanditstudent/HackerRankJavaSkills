package JavaExercises;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        a.toLowerCase();
        b.toLowerCase();
//Character.getNumericValue()
        char[] aarray=new char[a.length()];
        char[] barray=new char[b.length()];

        int totala=0;
        int totalb=0;

        for (int i=0;i<a.length();i++){
            aarray[i]= Character.toLowerCase( a.charAt(i));
           // int ascii;
           // ascii=Character.toLowerCase( a.charAt(i));
           // System.out.println(ascii);
            //System.out.println(Character.getNumericValue(Character.toLowerCase( a.charAt(i))));
            System.out.println(Character.toLowerCase( a.charAt(i)));


            // totala+=Character.getNumericValue(Character.toLowerCase( a.charAt(i)));
            totala+=Character.toLowerCase( a.charAt(i));
        }
        System.out.println(" Total a "+totala+" ");
        for (int i=0;i<b.length();i++){
            barray[i]= Character.toLowerCase( b.charAt(i));
            System.out.println(Character.toLowerCase( b.charAt(i)));
            // System.out.println(Character.getNumericValue(Character.toLowerCase( b.charAt(i))));
           // totalb+=Character.getNumericValue(Character.toLowerCase( b.charAt(i)));
            totalb+=Character.toLowerCase( b.charAt(i));
        }
        System.out.println(" Total b "+totalb+" ");
        for (char aa:aarray){
            System.out.print(aa+" ");
        }
        for (char bb:barray){
            System.out.print(bb+" ");
        }
        if (totala==totalb)
        return true;
        else return false;
    }

    public static void main(String[] args) {
	// write your code here

        String a = "bbcc";
        String b = "dabc";

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

}
