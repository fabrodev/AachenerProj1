package ocp8.chap4.lambda.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 14.01.17
 * Time: 21:44
 * package : ocp8.chap4.lambda.streams
 * Responsability of classe :
 */
public class MainPrimitiveStreams {
    public static void main(String[] args) {




        DoubleStream empty = DoubleStream.empty();
        DoubleStream oneValue = DoubleStream.of(2.0);
        DoubleStream varargs = DoubleStream.of(1.0, 2.0, 1.1);

        oneValue.forEach(System.out::println);
        System.out.println(" ");

        varargs.forEach(System.out::println);

        System.out.println(" ");

        DoubleStream    random = DoubleStream.generate(Math::random);
        random.limit(5)
        .forEach(System.out::println);



        System.out.println(" ");
        DoubleStream fractions = DoubleStream.iterate(1.0, d->d/2);

        fractions.limit(5).forEach(System.out::println);


        System.out.println(" ");

        System.out.println("Livret A apres 4 ans ");
        DoubleStream livretA = DoubleStream.iterate(22900, d-> d* 1.0080);

        livretA.limit(8).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("IntStream iterate ");

        IntStream count = IntStream.iterate(1, n-> n+1).limit(5);
        count.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("IntStream range :IntStream.range(1,5)");
        IntStream range = IntStream.range(1,5);
        range.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("IntStream RangeClosed : IntStream.rangeClosed(1,5)");

        IntStream rangeClosed = IntStream.rangeClosed(1,5);
               rangeClosed.forEach(System.out::println);




        System.out.println("Create primitive Stream by mapping from another Stream  WITh mapToInt ");

        Stream<String> objStream = Stream.of("penguin", "fisch");
        IntStream intStream = objStream.mapToInt(s->s.length());
        intStream .forEach(System.out::println);















    }


}
