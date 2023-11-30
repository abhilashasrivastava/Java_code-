package Function;

import java.util.Scanner;

public class Return {

    public static int addNumbers(int a, int b){
        int summation =  a+b;
        return summation;
    }
    public static String mY(String year){
        return year;

    }
    public static int addNum(){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int add= num1+num2;
        return add;
}
public static void main(String[] args){
    //   int sum=addNum();
   // System.out.println(sum);
    int ans=addNumbers(4,8);
   // System.out.println(ans);
    String message=mY("56");
    System.out.println(message);
    }
}
