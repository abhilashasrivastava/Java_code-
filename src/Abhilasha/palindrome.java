package Abhilasha;

public class palindrome {
    public static void main(String[] args){
        int n=543;
        int sum=0;
        int rem;
        int temp;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;;

        }


        if(sum==n){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
