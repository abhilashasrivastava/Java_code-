package Recursion;

public class sumoddigit {
    public static void main(String[] args) {
        System.out.println(digit(543));

    }

    public static int digit(int n){
        if(n<= 1){
            return n;
        }
        int rem = n%10;
        return (rem + digit(n/10));

    }
}
