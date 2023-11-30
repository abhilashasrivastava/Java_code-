package Recursion;

public class five_one_one_five {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
        System.out.println(n);
    }

//    public static void print_Num(int e){
//        if (e==6){
//            return;
//        }
//        System.out.println(e);
//        print_Num(e+1);
   // }
    public static void main(String[] args) {
         int n;
         printNum(5);
//        (1); int e;
//        print_Num
    }
}
