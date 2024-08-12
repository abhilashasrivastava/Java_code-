package Math;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        //System.out.println(sqrt(n , precision));
        System.out.printf("%.3f",sqrt(n , precision));
    }
    private static double sqrt(int n, int precision){
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == n){
                return mid;
            }
            else if (mid * mid > n) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
                }
            }
        //root = end;if not use this use preety printing
        double incr = 0.1;
        for(int i = 0; i < precision; i++) {
            while (root * root <= n) {
                root = root + incr;
            }
            root = root - incr;
            incr = incr / 10;
        }
        return root;
    }
}
