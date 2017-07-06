package miredin.tutojava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 03.03.16
 * Time: 10:49
 * package : miredin.tutojava8
 * Responsability of classe :
 */
public class DivenIn {

    public static void main(String... args){

        List<Apple> inventory = Arrays.asList(
                new Apple(2,"green"),
                new Apple(3,"green"),
                new Apple(1,"green"),
                new Apple(4,"green"),
                new Apple(5,"green"),
                new Apple(2,"green"),
                new Apple(3,"green"),
                new Apple(2,"red"),
                new Apple(2,"red"),
                new Apple(2,"red"),
                new Apple(3,"red"),
                new Apple(2,"red"),
                new Apple(6,"red"),
                new Apple(2,"red"),
                new Apple(4,"red"),
                new Apple(1,"red"),
                new Apple(2,"red"),
                new Apple(1,"red"),
                new Apple(1,"red"));


        inventory.sort(Comparator.comparing(Apple::getWeigth));


    }





}
