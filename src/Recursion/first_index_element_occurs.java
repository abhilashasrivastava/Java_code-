package Recursion;

public class first_index_element_occurs {
    public static int firstIndex(int[] arr, int si , int data){
        if(si== arr.length){
            return -1;
        }


        if(data==arr[si]){
            return si;
        }
        int restarray= firstIndex(arr,si+1 ,data);
        return restarray;
    }




    public static void main(String[] args){
         int[] arr={6,8,1,1,8,3,4};
         int yup=firstIndex(arr,0,1);
         System.out.println(yup);


    }
}
