package kunaldsa;

public class productOfDigit {
    public static void main(String[] args) {
      int ans=  pdigit(345);
        System.out.println(ans);
    }
    static int pdigit(int n){
        if(n%10==n){
            return n;
        }
        int m=n%10;
        return (m*pdigit(n/10));
    }
}
