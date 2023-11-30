package ARRAY;

public class largestOfThree {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 12;
        arr[1] = 15;
        arr[2] = 4;
        if (arr[0] > arr[1] && arr[0] > arr[2]) {
            System.out.println(arr[0]+" " + "is the largest");
        } else {
            if (arr[1] > arr[0] && arr[1] > arr[0]) {
                System.out.println(arr[1] +" "+ "is the largest");
            } else {
                System.out.println(arr[2] + " "+"is the largest");
            }

        }
    }
}