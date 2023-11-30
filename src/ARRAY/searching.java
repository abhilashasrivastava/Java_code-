package ARRAY;
import java.util.*;

public class searching {
    public static void main(String[] args){
        int arr[]={1,9,6,4,8,7,};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number To Be Searched:");
        int n=sc.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==n){
                System.out.println("index of arr[i]"+i);
            }
        }
    }
}
