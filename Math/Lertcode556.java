package Math;
import java.util.*;

public class Lertcode556 {
    public static void main(String[] args) {
        int n = 21;
        String new1 = Integer.toString(n);
        char[] array = new1.toCharArray();

        //System.out.println(new1);
        for(int i = 0; i<array.length-1;i++){
            if(array[i] < array[i+1]){
                char temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                String swapped = new String(array);
                System.out.println(swapped);
                int number = Integer.parseInt(swapped);
                System.out.println(number);

                break;
            }

            else {
                System.out.println(-1);
            }
        }

    }
}
