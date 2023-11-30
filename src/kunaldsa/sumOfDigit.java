package kunaldsa;

public class sumOfDigit {
    public static void main(String[] args) {
       int ans= digit(2345);
        System.out.println(ans);
    }
    static int digit(int n){
        if(n==0 || n==1){
            return n;
        }
        int rem=n%10;
        int y=rem+digit(n/10);
        return y;
    }
}
