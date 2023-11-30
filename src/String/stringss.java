package String;
import java.util.*;
import java.lang.Math;

public class stringss {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int res=a;
        for(int i=0;i<n;i++){

                res = res+b*(int)Math.pow(2,i);

                System.out.println(res);
//                i++;


    }
}}
