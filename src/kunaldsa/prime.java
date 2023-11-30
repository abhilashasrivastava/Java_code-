package kunaldsa;

public class prime {

    public static void main(String[] args) {
        prime(1);
    }
    static void prime(int n){
        if(n<=1){
            return;

        }
        if(n%2==0){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }

    }
    }