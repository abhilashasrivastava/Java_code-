package Recursion;

public class palindrome {
    public static void main(String[] args) {
        palin(543);

    }

    public static int palin(int n){
        if(n<=1){
            return n;
        }
        int sum =0;
        int rem = n%10;
        sum = sum*10+rem;
        System.out.print(sum);
        return  palin(n/10);
    }
}
