import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Solution1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
    BigInteger bi1=new BigInteger(n);
Boolean b1=bi1.isProbablePrime(1);
        scanner.close();
    if (b1==true){
        System.out.println("prime");
    }
        else 
       System.out.println("not prime");
            
        

    }
    
    }

