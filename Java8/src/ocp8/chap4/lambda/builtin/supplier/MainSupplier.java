package ocp8.chap4.lambda.builtin.supplier;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 21.09.16
 * Time: 16:21
 * package : ocp8.chap4.lambda.builtin
 * Responsability of classe :
 */
public class MainSupplier {

    public static void main(String...  v){
        MainSupplier gf = new MainSupplier();
        // gf.everyyOnePlay(true);


        Supplier<LocalDate> s1 = () -> LocalDate.now();    // implementation de la FI
        System.out.println(s1.get());    // la methode qui prend la FI



        Supplier<Date> s2 = () -> new Date();    // implementation de la FI
        System.out.println(s2.get());    // la methode



        Supplier<StringBuilder> s3 = ()->new StringBuilder("Hello world#");
        System.out.println(s3.get());    // la methode



        Supplier<List<String>> s4 = ()-> new ArrayList<String>();
        Supplier<List<String>> s5 = () -> {
            return Arrays.asList("fgrthgt", "dstghtz");

        };
               System.out.println(s4.get());    // la methode
               System.out.println(s5.get());    // la methode
      //  ArrayList<String> list =       s4.get()
       // System.out.println(s4.get());    // la methode



       }




}
