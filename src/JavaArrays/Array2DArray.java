package JavaArrays;

import java.util.Scanner;

public class Array2DArray {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int start ;
        int rowstart=-1;
        int subtotal=0;
        int maxinrow=99999;
        int max=99999;

        //I created an iteration of 3X3 array matrix to the right to get number of column -2  and then moving to the bottom -2
        // By travesing to each 3X3 iteration to make hourglass, I eliminated the non wanted numbers to make hourglass figure - using counter to keep track of items.


        for (int moverowsdone = 0; moverowsdone < arr.length-2;moverowsdone++) {
            rowstart++; // this moves the row down to grab until n-2 // row shifter to downward//this moved 3X3 matrix down
            start=-1;   // this is a column mover to right//
            for (int topcols = 0; topcols < arr[0].length - 2; topcols++) {     //this moves 3X3 matrix to next column
                start++;
                int counter=0;
                for (int row = 0+rowstart; row < 3+rowstart; row++) {  //ROWS FOR EACH ITERATION to get a 3X3 array
                    for (int col = 0+start; col < 3+start; col++) {   // COLUMNS FOR EACH ITERATION to get a 3X3 array
                        counter++; // to make glass figure, each time we do not need 4 & 6
                        if (counter != 4 & counter != 6){ // to ensure hour glass figure
                            subtotal+=arr[row][col];
                        }
                    }
                }
                if (max==99999)max=subtotal; // to counter negative- allocating first value a max for first time run
                if (subtotal>max){
                    max=subtotal;
                }
                subtotal=0;
            }
        }
        System.out.println(max);
    }
}
