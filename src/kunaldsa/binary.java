package kunaldsa;

public class binary {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,8,9};
        int target= 7;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                System.out.print(mid);
                 break;
            }
        }
        System.out.println("-1");
    }
}
