import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0 || n==1){
            System.out.println("not prime");
        }
        for(int i=2;i<=n;i++){
            if(n%2==1){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }

    }
    
}
