package kunaldsa;

public class PALINDEOME {
    public static void main(String[] args) {
        num(6789);

    }
    static void num(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        System.out.print(rem);
        num(n/10);
    }
}




