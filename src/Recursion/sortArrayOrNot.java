package Recursion;

public class sortArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        System.out.println(Sorted(arr,0));

    }
    public static boolean Sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        return (arr[i] < arr[i+1] && Sorted(arr,i+1));


}}
