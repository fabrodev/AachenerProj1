package ocp8.chap4.lambda.builtin.unaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainUnaryOperator {
       /*
       Function where All parameter have the same Type T and retuzrn a value  with the same Type T
        */

    public static void main(String... sss) {


        UnaryOperator<String>   upperCaseConverter = x ->  x.toUpperCase();





     //   stadtPrinter.andThen(wordSizeChecker);

     //   System.out.println(upperCaseConverter.apply("Aachen"));


        Function<String, Integer> wordSizeChecker  = s -> s.length();
        Function<String, Integer> upperAndCount = upperCaseConverter.andThen(wordSizeChecker);
      //  Function<String, Integer> upperAndCount = upperCaseConverter.andThen(stadtPrinter);
  //      Function<String, Integer> upperAndCount = stadtPrinter.andThen(wordSizeChecker);
   //     Function<String, Integer> upperAndCount = stadtPrinter.andThen(wordSizeChecker);

        System.out.print(upperCaseConverter.apply("Aachen") +" :");
        System.out.println(upperAndCount.apply("Aachen"));

        System.out.print(upperCaseConverter.apply("Frankfurt am main") +" :");
        System.out.println(upperAndCount.apply("Frankfurt am main"));


        System.out.print(upperCaseConverter.apply("Regensburg") +" :");
        System.out.println(upperAndCount.apply("Regensburg"));

        System.out.print(upperCaseConverter.apply("Wels") +" :");
        System.out.println(upperAndCount.apply("Wels"));

        System.out.print(upperCaseConverter.apply("Wien") +" :");
        System.out.println(upperAndCount.apply("Wien"));

        System.out.print(upperCaseConverter.apply("Gyor") +" :");
        System.out.println(upperAndCount.apply("Gyor"));

        System.out.print(upperCaseConverter.apply("Budapest") +" :");
        System.out.println(upperAndCount.apply("Budapest"));

        System.out.print(upperCaseConverter.apply("Arad") +" :");

        System.out.println(upperAndCount.apply("Arad"));

        System.out.print(upperCaseConverter.apply("Deva") +" :");
        System.out.println(upperAndCount.apply("Deva"));

        System.out.print(upperCaseConverter.apply("Sibiu") +" :");
        System.out.println(upperAndCount.apply("Sibiu"));

        System.out.print(upperCaseConverter.apply("Targoviste") +" :");
        System.out.println(upperAndCount.apply("Targoviste"));


           /*
               Function<String, String> OrtFormatter  =  (ort) -> ort.concat(" ");

               BiFunction<String, String, String> OrtPlZConcatenner  =  (ort, plz) -> ort.concat( plz);




               System.out.println(OrtFormatter.apply("Aachen"));
               System.out.println(OrtPlZConcatenner.apply("Aachen ", "52062"));

               System.out.println(OrtPlZConcatenner.apply(OrtFormatter.apply("Düsseldorf"), "52062"));


               Function<List<String>, Integer> itemCounter  =  (liste) -> liste.size();


               System.out.println(itemCounter.apply(Arrays.asList("Aachen", "Düsseldorf", "Targoviste", "Budapest", "Wels", "Regensburg")));
              // System.out.println(OrtPlZConcatenner.apply(OrtFormatter.apply("Düsseldorf"), "52062"));
               //System.out.println(OrtPlZConcatenner.apply(OrtFormatter.apply("Düsseldorf"), "52062"));

            */



           }


}