package Abhilasha;

public class febonnaci {
    public static void main(String[] args){
        int n1,n2,n3;
        int n=5;
         n1=0;
        n2=1;

        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
