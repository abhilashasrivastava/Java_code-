package Function;
import java.util.Scanner;

public class CircumArea {
    public static int all() {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double cir = 2 * (3.14) * r;
        double area = (3.14) * r * r;
        System.out.println(cir);
        System.out.println(area);
        return 1;
    }
    public static void main(String[] args){
        all();
    }
}
