package Recursion;
import java.util.*;

public class min_max {
    public static void main(String[] args) {
        int[] arr ={2,1,3,6};
        int n = arr.length;
        System.out.println("Minimum no is " + MIN(arr,n));
        System.out.println("Maximum no is " + MAX(arr,n));

    }
    public static int MIN(int[] arr, int n){
        if(n == 1){
            return 1;
        }
        return Math.min(arr[n-1], MIN(arr,n-1));
    }
    public static int MAX(int[] arr, int n){
        if(n == 1){
            return 1;
        }
        return Math.max(arr[n-1], MIN(arr,n-1));
    }


}
