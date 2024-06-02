package kunaldsa;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        int[] arr = {0, 4, 3, 0, 4};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Iterate from 0 to the length of the array
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;

            // Count how many elements are greater than or equal to i
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    count++;
                }
            }

            // Check if count is equal to i
            if (count == i) {
                System.out.println(i);
                return; // Exit the program after finding the special number
            }
        }

        // If no special number is found, print -1
        System.out.println(-1);
    }
}
