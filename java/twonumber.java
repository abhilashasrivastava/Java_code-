import java.util.*;
public class twonumber {
    public static void main(String[] args){
        System.out.println("enter first number");
        System.out.println("enter second number:");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a==b){
            System.out.println("both numbers are equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is lesser than b");
        }
    }   
}
