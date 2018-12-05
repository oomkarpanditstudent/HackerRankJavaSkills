package JavaExercises;

public class RegexSandbox {

    public static void main(String[] args) {
	// write your code here


        String s = "255.12.12.034";
        // Write your code here.
        if (s.trim().length()==0){
            System.out.println(s.trim().length());
        }else {
        String[] result= s.trim().split("[0,255]\\d{1,3}\\.[0,255]\\d{1,3}\\.[0-255]\\d{1,3}\\.[0-255]\\d{1,3}");
        System.out.println(result.length);
        for (String ss:result){
            System.out.println(ss);
        }}
    }

}
