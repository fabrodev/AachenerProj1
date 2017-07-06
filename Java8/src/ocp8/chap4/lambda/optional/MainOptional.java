package ocp8.chap4.lambda.optional;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 25.11.16
 * Time: 16:09
 * package : ocp8.chap4.lambda.optional
 * Responsability of classe :
 */
public class MainOptional {


    public static void main(String... s) {

        System.out.println(average(41,34,2));
        System.out.println(average(6800,40,0,0,0,0,0,0,0,0,0,0));


        Optional<Double> opt = average(1, 2, 4, 7);
        //System.out.println(opt.get());
        System.out.println(opt.orElse(0.0)  );
        //System.out.println(opt.orElseGet(()-> System.out.println("Pas de valeur ici")));    // no compile because pb with return typematching
        System.out.println(opt.orElseGet(()-> Math.random()));
        System.out.println(opt.orElseGet(()->  new Double(555.0)));
        //System.out.println(opt.orElseThrow  (()-> new IllegalStateException("pb ici")));
        //System.out.println(opt.orElseThrow  (()-> new IllegalStateException()));
       // System.out.println(opt.orElseThrow (()-> new Exception("Fabrice verifie stp ici ..cava pas"));



        Optional<Double> opt1 = average(42, 35, 3);
        Optional<Double> opt2 = average(30, 23);
        Optional<Double> opt3 = average();

        Consumer<Double> c1 = x -> {
            System.out.println(x);

//            System.out.println("ceci est un test de ifPresent(Consumer) -- " +
//                    "On ecrit directement le consumer dans le ifPresent(c1) ")  ;
        };


        opt1.ifPresent(c1);
        opt2.ifPresent(c1);
        System.out.println("opt3.ifPresent(c1)%s%n  ");
        opt3.ifPresent(c1);





}



public static Optional<Double> average(int... scores){

    if (scores.length == 0) return Optional.empty();
    double sum = 0.0;
    for (int i: scores ) {
        sum +=  i;
    }

    return   Optional.of((double)sum/ scores.length);
}




}
