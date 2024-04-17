package kunaldsa;
import java.util.*;

public class spiral2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //System.out.println(arr.length);
        int row = arr.length;
        int col = arr[0].length;
        int top_row = 0;
        int bottom_row = row - 1;
        int left_col = 0;
        int right_col = col - 1;
        // top row
        while (top_row <= bottom_row && left_col <= right_col) {
            for (int i = left_col ; i <= right_col; i++) {
                System.out.println(Math.pow(arr[top_row][i],2));
            }
            top_row++;
            for (int i = top_row; i<= bottom_row; i++){
                System.out.println(Math.pow(arr[i][right_col],2));
            }
            right_col--;
            if(top_row<=bottom_row){
                for (int i = right_col; i>= left_col; i--){
                    System.out.println(Math.pow(arr[bottom_row][i],2));
                }
                bottom_row--;
            }
            if(left_col<=right_col){
                for(int i = bottom_row;i>=top_row; i--){
                    System.out.println(Math.pow(arr[i][left_col],2));
                }
                left_col++;

            }


        }
    }
}