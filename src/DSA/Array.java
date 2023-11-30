package DSA;

import java.util.Scanner;

public class Array {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        String dinner[]=new String[size];
        for(int i=0;i<size;i++){
            dinner[i]=sc.next();
        }
        for(int i=0;i<size;i++){
            System.out.println(dinner[i]);



        }
    }
}
