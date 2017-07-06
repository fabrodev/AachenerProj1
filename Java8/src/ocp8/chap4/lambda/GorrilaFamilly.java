package ocp8.chap4.lambda;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 21.09.16
 * Time: 13:46
 * package : ocp8.chap4.lambda
 * Responsability of classe :
 */


// FI : Fonctional Interface with a suingle abstract method
interface Gorrila{
    String move();
}

public class GorrilaFamilly {

    String walK = "walk";

    // this method take a parametere FI--> possible to paramtrize this paramter with a lambda
    void play(Gorrila g){

        System.out.println(g.move());
    }

    void everyyOnePlay(boolean baby){
        String approach = "approcha";
        //approach = "run";

        play(()->walK);
        play(()-> baby ? "hitch a ride": "run");
        play(()->approach);
        //play(());


    }

    public static void main(String...  v){
        GorrilaFamilly gf = new GorrilaFamilly();
        gf.everyyOnePlay(true);
    }

}
