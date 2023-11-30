package DSA;
import java.util.*;
public class Opsarray {
    public static void main(String[] args) {
        int[] array = arrayOps();
        display(array);
    }

    public static int[] arrayOps() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }



    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
