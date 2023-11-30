package Recursion;

public class kunalFebonacci {
    public static void main(String[] args) {
        print(5);
    }
     static int  print(int n) {
         if (n == 0) {
             return 1;
         }


         int fact = print(n - 1);
         int a = n * fact;
         System.out.println(a);
    return a;
    }
}
