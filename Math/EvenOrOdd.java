package Math;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 70;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }

}
