package Recursion;

public class five_three_one_two_four {
    public static void print_Num(int n){
        if(n==0){
            return;
        }
        if(n%2==1) {


            System.out.println(n);
        }
        print_Num(n-1);
        if(n%2==0) {
            System.out.println(n);
        }


    }




    public static void main(String[] args){
        int n;
        print_Num(5);
    }
}
