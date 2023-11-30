package DSA;

import java.util.Scanner;

public class binary {
    public static void main (String[] args){
        int[] arr={10,40,50,60,70,90,100,110};
        System.out.println("Enter number to be searched:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int lower=0;
        int upper=arr.length-1;
        int mid=(lower+upper)/2;
        if(n==arr[mid]){
            System.out.println("index is" + mid);
        }
        while(n!=arr[mid]){
            if(n<arr[mid]){
                upper=mid-1;
            }
            else{
                lower=mid+1;
            }
    }
}}
