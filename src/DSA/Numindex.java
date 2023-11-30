package DSA;
import java.util.Scanner;
public class Numindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
        System.out.println("enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (num[i] == n)


                System.out.println(i);

        }
    }
}
