package core.basesyntax;

public class Ball {
    final private int number;
    final private String color;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public String toString(){
       return "Color: " + color + " Number: " + number;
    }
}
