package Function;
import java.util.*;
public class Method {
    public static void printMy(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMy(name);
    }
}
