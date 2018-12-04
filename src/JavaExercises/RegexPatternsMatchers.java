package JavaExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternsMatchers {

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.print("Valid");
            }catch (Exception exception){
                System.out.print("Invalid");

            }
            testCases--;
        }
    }
}

