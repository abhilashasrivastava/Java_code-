package Function;
import java.util.*;
public class EvenOdd {
    public static void printOddEven(){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("%d is even");
        }
        else{
            System.out.println("%d is odd");
        }
    }
    public static void main(String[] args){

        printOddEven();
    }
}
