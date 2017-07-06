package ocp8.chap3.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * User: work
 * Date: 04.09.16
 * Time: 15:52
 * package : ocp8.chap3.comparator
 * Responsability of classe :
 */
public class Duck implements Comparable<Duck>   {

    private String name;
    private int weigth;

    public Duck(String name, int weigth){
        this.               name = name;
        this.weigth = weigth;
    }


    public String getName() {
        return name;
    }


    public int getWeigth() {
        return weigth;
    }

    public String toString(){
        return name;
    }

    public int compareTo(Duck d) {
        return name.compareTo(d.getName());  // field - field Paramter  == ascending   order
    }


    public static void main(String... args){
        Comparator<Duck> byWeight = new Comparator<Duck> (){
            public int compare(Duck d1, Duck d2){
                return d1.getWeigth() - d2.getWeigth();
            }
        };

        //similar to precedent
        Comparator<Duck> byWeigth2 = (d1, d2) -> d1.getWeigth() -d2.getWeigth();
        Comparator<Duck> byWeigth3 = (d1, d2) -> {return  d1.getWeigth() -d2.getWeigth();};
        Comparator<Duck> byWeigth4 = (Duck d1, Duck d2) -> d1.getWeigth() -d2.getWeigth();



        List<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quacks", 7));
        ducks.add(new Duck("Puddles", 10));

        Collections.sort(ducks);
        System.out.println(ducks);

        Collections.sort(ducks, byWeight);
        System.out.println(ducks);
        Collections.sort(ducks, byWeigth2);
        System.out.println(ducks);


    }

}
