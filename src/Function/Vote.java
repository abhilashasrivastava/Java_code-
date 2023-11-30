package Function;
import java.util.*;
public class Vote {
    public static void eligible(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the age of the person:");
        int a= sc.nextInt();

        if(a>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
    public static void main(String[] args){
        eligible();
    }
}
