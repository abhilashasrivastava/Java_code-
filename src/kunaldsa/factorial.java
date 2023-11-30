package kunaldsa;

public class factorial {
    public static void main(String[] args) {

        int  ans=fact(5);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
       int t=n*fact(n-1);
        return t;
    }
}
