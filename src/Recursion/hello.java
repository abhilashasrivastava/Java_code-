package Recursion;

public class hello {
    public static void printNme() {
        System.out.println("hello");
        printNme();

    }

    public static void main(String[] args) {
        printNme();

    }
}
