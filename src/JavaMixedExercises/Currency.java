package JavaMixedExercises;
import java.util.*;
import java.text.*;
public class Currency {

    public static void main(String[] args) {
	// write your code here


                double payment = 123456.789;
                NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
                String us=nf.format(payment);
                nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
                String china=  nf.format(payment);
                nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                String france=nf.format(payment);
                Locale localeIndia=new Locale.Builder().setLanguage("en").setRegion("IN").build();
                nf = NumberFormat.getCurrencyInstance(localeIndia);
                String india=nf.format(payment);

                System.out.println("US: " + us);
                System.out.println("India: " + india);
                System.out.println("China: " + china);
                System.out.println("France: " + france);


    }
        }





