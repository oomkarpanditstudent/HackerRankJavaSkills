package JavaExercises;

public class StringTokens {

    public static void main(String[] args) {
	// write your code here

    String s="He is a @gmail1.com";
  // String[] result= s.split("[A-Za-z !,?._'@]+",10);
 //String[] result= s.split("[A-Za-z  !,?._'@+]");
String[] result= s.split("@gmail.com");
//result.
   for (String ss:result){
       System.out.print(ss);
   }
    }

}
