package kunaldsa;

public class spiralgpt {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int row = arr.length;
        int col = arr[0].length;
        int top_row = 0;
        int bottom_row = row - 1;
        int left_col = 0;
        int right_col = col - 1;

        // Iterate until the boundary conditions are met
        while (top_row <= bottom_row && left_col <= right_col) {
            // Print top row
            for (int i = left_col; i <= right_col; i++) {
                System.out.print(arr[top_row][i] + " ");
            }
            top_row++;

            // Print right column
            for (int i = top_row; i <= bottom_row; i++) {
                System.out.print(arr[i][right_col] + " ");
            }
            right_col--;

            // Print bottom row
            if (top_row <= bottom_row) {
                for (int i = right_col; i >= left_col; i--) {
                    System.out.print(arr[bottom_row][i] + " ");
                }
                bottom_row--;
            }

            // Print left column
            if (left_col <= right_col) {
                for (int i = bottom_row; i >= top_row; i--) {
                    System.out.print(arr[i][left_col] + " ");
                }
                left_col++;
            }
        }
    }
}
