package JavaExercises;

public class JavaSubstring {
    public static void main(String[] args) {


        String A = "madam";

        int i=0;
        int o=A.length()-1;
        while (o>=0) {
            if (A.charAt(i) == A.charAt(o)) {
                i++;
                o--;
            } else {
                System.out.println("No");
                break;
            }

        }
        if (o<0)
            System.out.print("Yes");
    }
}
