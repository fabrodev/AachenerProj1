package ocp8.chap4.lambda.builtin.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 21.09.16
 * Time: 17:01
 * package : ocp8.chap4.lambda.ocp8.chap4.lambda.builtin.consumer
 * Responsability of classe :
 */
public class MainConsumer {

    public static void main(String...  s) {

        Consumer<String> c1 = x -> {System.out.println(x);};

        c1.accept("Fabrice");


        Map<String,Integer> map =   new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = (k, v) -> map.put(k,v);
        b1.accept("a",1);
        b1.accept("b",2);
        b1.accept("c",3);
        b1.accept("d",4);

        System.out.println(map);


    }
}
