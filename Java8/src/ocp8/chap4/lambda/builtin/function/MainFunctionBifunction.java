package ocp8.chap4.lambda.builtin.function;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 29.12.16
 * Time: 10:38
 * package : ocp8.chap4.lambda.builtin.function
 * Responsability of classe :
 */
public class MainFunctionBifunction {


    public static void main(String... s) {


            Function<String, String> OrtFormatter  =  (ort) -> ort.concat(" ");

            BiFunction<String, String, String> OrtPlZConcatenner  =  (ort, plz) -> ort.concat( plz);




            System.out.println(OrtFormatter.apply("Aachen"));
            System.out.println(OrtPlZConcatenner.apply("Aachen ", "52062"));

            System.out.println(OrtPlZConcatenner.apply(OrtFormatter.apply("Düsseldorf"), "52062"));


            Function<List<String>, Integer> itemCounter  =  (liste) -> liste.size();


            System.out.println(itemCounter.apply(Arrays.asList("Aachen", "Düsseldorf", "Targoviste", "Budapest", "Wels", "Regensburg")));
           // System.out.println(OrtPlZConcatenner.apply(OrtFormatter.apply("Düsseldorf"), "52062"));
            //System.out.println(OrtPlZConcatenner.apply(OrtFormatter.apply("Düsseldorf"), "52062"));





        }

}
