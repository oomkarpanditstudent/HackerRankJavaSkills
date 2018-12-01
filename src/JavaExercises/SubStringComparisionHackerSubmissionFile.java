package JavaExercises;

public class SubStringComparisionHackerSubmissionFile {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int start = 0;
        int increment = k;
        String store[] = new String[s.length() - increment+1];
        for (int i = 0; i <= s.length() - increment; i++) {
            store[i] = s.substring(i, i + increment);

        }
        int counter=0;
        do {
            for (int i = 0; i < store.length - 1; i++) {
                if (store[i].compareTo(store[i + 1]) > 0) {
                    String placeholder = store[i];
                    store[i] = store[i + 1];
                    store[i + 1] = placeholder;
                    counter++;
                }

            } if (counter>0){
                counter=0;
            } else counter=-1;

        } while (counter>=0);
            smallest=store[0];
            largest=store[store.length-1];
            return smallest + "\n" + largest;
    }
        public static void main (String[] args){
            // write your code here

            String s = "welcometojava";
            int k = 3;


            System.out.println(getSmallestAndLargest(s, k));
        }

    }
