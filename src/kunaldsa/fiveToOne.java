package kunaldsa;

public class fiveToOne {
    public static void main(String[] args) {
        five(5);
        fiveReverse(5);
    }
    static void five(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        five(n-1);


    }
    static void fiveReverse(int n) {
        if (n == 0) {
            return ;
        }

        fiveReverse(n -1);
        System.out.println(n);
    }
}
