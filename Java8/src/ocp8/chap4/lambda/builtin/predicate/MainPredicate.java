package ocp8.chap4.lambda.builtin.predicate;

import java.util.function.Predicate;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 21.09.16
 * Time: 17:45
 * package : ocp8.chap4.lambda.ocp8.chap4.lambdaocp8.chap4.lambda.builtin.predicate
 * Responsability of classe :
 */
public class MainPredicate {


    public static void main(String... s) {

        /**
        Predicate<String> p1 = x -> x.isEmpty() ;


        System.out.println(p1.test("fabrice"));
        System.out.println(p1.test(""));


        BiPredicate <String,String> bp1 = (x,y) -> x.startsWith(y);

        System.out.println(bp1.test("fabrice", "fa"));
        System.out.println(bp1.test("fabrice", "a"));
        System.out.println(bp1.negate());
        System.out.println((bp1.negate()).test("fab", "a"));

          **/

        Predicate<String> egg = x -> x.contains("egg");
        Predicate<String> green = x -> x.contains("green");

        System.out.println(egg.test("osternegg"));
        System.out.println(green.test("osternegggreen"));

        Predicate<String> greeeneggs = egg.and(green);
        System.out.println(greeeneggs.test("osternegggreen"));


        Predicate<String> nogreeeneggs = egg.and(green.negate());

        System.out.println(nogreeeneggs.test("osternegggblue"));
        System.out.println(nogreeeneggs.test("osterneggggreen"));

        /**
         * savoir faire un predicate et l appeler.
         * savoir composer des predicate entre eux
         */

        Predicate<String> pomme = x -> x.contains("pomme") ;
        Predicate<String> poire = x -> x.contains("poire") ;
        Predicate<String> pommeOupoire = pomme.or(poire);

        System.out.println(pommeOupoire.test("poireBLanchePommeGolden"));
        System.out.println(pommeOupoire.test("poireBLanchePommeGolden"));


        /**
        Predicate<String> legume = {  return
                x -> x.contains("carotte")
              || x.contains("patate")
              ||  x.contains("oignon")   ;


        };
            **/
        Predicate<String> legume1 = x -> x.contains("carotte") || x.contains("patate") || x.contains("oignon");
        Predicate<String>   fruit = legume1.negate();

        System.out.println(legume1.test("oignonAilaubergine"));
        System.out.println(legume1.test("poireBLanchePommeGolden"));
        System.out.println(fruit.test("poireBLanchePommeGolden"));













    }

}

