package Function;

import java.util.Scanner;

public class product {
    public static int product(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first number:");
        int a= sc.nextInt();
        System.out.print("enter second number:");
        int b= sc.nextInt();
        int pro=a*b;
        return pro;

    }
    public static void main(String[] args){
        int mul= product();
        System.out.println(mul);
    }
}
