package Function;
import java.util.Scanner;
public class Prime {
    public static void primee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to be checked:");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("not prime");
        }

        for (int i = 2; i <= n; i++) {
            if(n%2==1) {
                System.out.println("number is prime");
            }
            else {
                System.out.println("number is not prime");
            }
        }
    }
    public static void main(String[] args){
        primee();
    }
}

