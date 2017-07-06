package ocp8.chap4.lambda.streams;

import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 30.12.16
 * Time: 11:04
 * package : ocp8.chap4.lambda.streams
 * Responsability of classe :
 */
public class MainStreamsTerminalOps {


    public static void main(String... sss) {

        // count
        Stream<String> myStream = Stream.of("Aachen", "Franfurt am Maoin", "Regensburg");
           System.out.println(myStream.count());


        //max()   --min()
        Stream<String> myStreamStaedte = Stream.of("Aachen", "Franfurt am Maoin", "Regensburg", "aaa", "bb");
       // Stream<String> myStreamStaedte2 =  Stream.concat(Stream.empty(), myStreamStaedte);
       // System.out.println(myStreamStaedte2.count());


        Optional<String> minSizteStadt = myStreamStaedte.min((s1,s2)->s1.length() - s2.length());
        minSizteStadt.ifPresent(System.out::println);

      //  System.out.println(myStream.count());



        // findAny()   findFirst()
        Stream<String> myStreamfindAny = Stream.of("Düsseldorf","Aachen", "Franfurt am Maoin", "Regensburg", "aaa", "bb");
              // Stream<String> myStreamStaedte2 =  Stream.concat(Stream.empty(), myStreamStaedte);
              // System.out.println(myStreamStaedte2.count());
               Optional<String> foundedAny = myStreamfindAny.findAny();
              // Optional<String> foundedFirst = myStreamfindAny.findFirst();

        foundedAny.ifPresent(System.out::println);
       // foundedFirst.ifPresent(System.out::println);


        //allMatch()  anyMatch()


        //forEach()    // Attntion forEach est une terminal Operation et pas de  for possible
        // icic car par de implementation de Iterablel
        Stream<String> streamForEach = Stream.of("Düsseldorf","Aachen", "Franfurt am Main", "Regensburg");
        streamForEach.forEach(System.out::println);


        // reduce    --combine a Stream  into a single Object
        Stream<String> stream2Reduce = Stream.of("f","a","b");
        String prenom =  stream2Reduce.reduce("",(s,c)->s+c)   ;
        System.out.println(prenom);



        Stream<Integer> streamInt2reduce = Stream.of(24000,18000,12000, 6000);
        Integer sum   =   streamInt2reduce.reduce(0,(x,y)-> x+y);
        System.out.println(sum);



        Stream<Integer> streamProductInt2reduce = Stream.of(1500,12);
        Integer product   =   streamProductInt2reduce.reduce(1,(x,y)-> x*y);
        System.out.println(product);


       //collect    it is a mutable reduction

        Stream<String> stream2Collect= Stream.of("f","a","b");
               StringBuilder prenomCollect =  stream2Collect
                       .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

               System.out.println(prenomCollect);


        // collect example with supplier  , accumulator and combiner
         Stream<String> streamUseCollector1= Stream.of("f","a","b");
         TreeSet<String> prenomSet1 =  streamUseCollector1
                               .collect(TreeSet::new, TreeSet::add, TreeSet::addAll );
          System.out.println(prenomSet1);


       // collect example with Collector
        Stream<String> streamUseCollector= Stream.of("f","a","b");
        TreeSet<String> prenomSet =  streamUseCollector
                              .collect(Collectors.toCollection(TreeSet::new));
         System.out.println(prenomSet);



    }
}
