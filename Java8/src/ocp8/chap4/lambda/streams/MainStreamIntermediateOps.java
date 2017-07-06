package ocp8.chap4.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 14.01.17
 * Time: 20:19
 * package : ocp8.chap4.lambda.streams
 * Responsability of classe :
 */
public class MainStreamIntermediateOps {

    public static void main(String[] args) {

        // Filter
        System.out.println("Filter: ");
        Stream<String> s = Stream.of("Foort de France ", "Abymes ", "Abymes ", "Rouen ", "Mont Saint aignan ", "Düsseldorf", "Aachen ");

        s.filter(x -> x.startsWith("A"))
                .forEach(System.out::print);


        //Distinct

        System.out.println();
        System.out.println("Distinct:  ");
        Stream<String> s1 = Stream.of("Foort de France ", "Abymes ", "Abymes ", "Rouen ", "Mont Saint aignan ", "Düsseldorf", "Aachen ");
        s1.filter(x -> x.startsWith("A"))
                .distinct()
                .forEach(System.out::print);


        //Limit

        System.out.println("Limit:  ");
        Stream<String> s2 = Stream.of("Foort de France", "Abymes", "Abymes", "alabama","Rouen", "Mont Saint aignan", "Düsseldorf", "Aachen");
        s2.filter(x -> x.startsWith("A"))
                .distinct()
                .limit(2)
                .forEach(System.out::println);

 // skip

//        System.out.println("Skip:  ");
//        Stream<String> s3 = Stream.of("Foort de France", "Abymes", "Abymes", "alabama","Rouen", "Mont Saint aignan", "Düsseldorf", "Aachen");
//        s3.filter(x -> x.startsWith("A"))
//                .distinct()
//                .limit(5)
//                .skip()
//                .forEach(System.out::println);

          Consumer c = t -> {
              System.out.print(t+ " ");
          };

          Stream<Integer>  s4 = Stream.iterate(1, x-> x+1);
            s4.skip(4)
                    .peek(c)
                    .limit(3)
                    .forEach(System.out::println);


        //Map   variante 1

        System.out.println();
                System.out.println("Map:  Variante 1 ");
                Stream<String> s5 = Stream.of("Foort de France ", "Abymes ", "Abymes ", "Rouen ", "Mont Saint aignan ", "Düsseldorf", "Aachen ");
                s5
                        //filter(x -> x.startsWith("A"))
                        .distinct()
                        .map(String::length)
                        .forEach(System.out::print);


        //Map   variante 2
 System.out.println();


                System.out.println("Map Variante 2 ");

        Function<String,Integer> f = x -> {return x.length();}    ;
                Stream<String> s6 = Stream.of("Fort de France ", "Abymes ", "Abymes ", "Rouen ", "Mont Saint aignan ", "Düsseldorf", "Aachen ");
                s6
                        //.filter(x -> x.startsWith("A"))
                        .distinct()
                        .map(f)
                        .forEach(System.out::print);



        System.out.println("  ");
        System.out.println("  ");
        System.out.println("FlatMap  ");


        List<String> zero = Arrays.asList();
        List<String>  one = Arrays.asList("bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Bebe gorilla");

        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l->l.stream()).forEach(System.out::println);
       // animals.forEach(System.out::println);



System.out.println("  ");
        System.out.println("Sorted  ");




        Stream<String> s8 = Stream.of("brown", "bear", "baby");
        s8.sorted()
                .forEach(System.out::println);








    }
}
