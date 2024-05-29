package Recursion;

public class linear {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target;
        System.out.println(linear(arr,10,0));

    }

    public static boolean linear(int[] arr , int target, int index ) {
        if(index == arr.length)
            return false;
        return (arr[index] == target || linear(arr,target,index+1));
    }

}
