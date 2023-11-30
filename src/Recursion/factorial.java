package Recursion;

public class factorial {
    public  static int calcfact(int n){
        if(n==1 || n==0){
            return  1;
        }
        int fact_nm=calcfact(n-1);
        int fact_n=n* fact_nm;
          return fact_n;
    }
    public static void main(String[] args){
    int n=5;
   int  ans=calcfact(n);
   System.out.println(ans);



    }
}
