package kunaldsa;
import java.util.*;

public class unique_element {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3};
        int i = 0;
        for (int j = 1; j< arr.length; j++ ){
            if(arr[i]!= arr[j]){
                i++;
                arr[i] = arr[j];
            }



            }

          // Print unique elements
            for (int k = 0; k <= i; k++) {
                System.out.println(arr[k]);


        }

    }
}
