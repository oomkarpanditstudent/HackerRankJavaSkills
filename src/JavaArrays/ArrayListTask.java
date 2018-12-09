package JavaArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {

    public static void main(String[] args) {
	// write your code here
    Scanner in= new Scanner(System.in);
    int inputs=in.nextInt();

    ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();

    while(inputs>0){
        int loops=in.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=loops;i>0;i--){

            list.add(in.nextInt());
        }
        lists.add(list);

        inputs--;
    }

   // System.out.print(lists.get(list.get(1));
    }

}
