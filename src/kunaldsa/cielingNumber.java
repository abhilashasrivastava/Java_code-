package kunaldsa;

public class cielingNumber {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9};
        int target=5;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                ans = arr[mid];
                start=mid+1;
            }
            if(target==arr[mid]){
                return arr[mid];
            }
        }
        return ans+2;
    }
}
