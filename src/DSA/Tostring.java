package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class Tostring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] num=new int[5];
       // String[] str =new String[3];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(num));

    }
}
