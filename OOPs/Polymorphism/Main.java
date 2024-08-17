package OOPs.Polymorphism;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        square.area();
    }
}
