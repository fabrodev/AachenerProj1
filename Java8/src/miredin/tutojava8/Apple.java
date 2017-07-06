package miredin.tutojava8;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 03.03.16
 * Time: 10:44
 * package : miredin.tutojava8
 * Responsability of classe :
 */
public class Apple {
        private String color;
        private int weigth;

    public Apple(int weigth, String color) {
        this.weigth = weigth;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }


}
