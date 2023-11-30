package Recursion;

public class febonacci {
    public static  void fibi(int n1,int n2,int n){
        if(n==0){
            return;
        }
         int n3=n1+n2;
        System.out.println(n3);
        fibi(n2,n3,n-1);


    }


    public static void main(String[] args){
        int n1=0,n2=1,n3;
        int n=4;
        System.out.println(n1);
        System.out.println(n2);

        fibi(n1,n2,n-2);
    }
}
