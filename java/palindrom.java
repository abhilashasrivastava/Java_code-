import java.util.*;
public class palindrom {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n =sc.nextInt();
            int rem;
            int rec=0;



            while(n>0){
                rem=n%10;
                rec=(rec*10)+rem;
                n=n/10;
            }
            if(n==rec)
                System.out.println("palindrome");
            
            else
                System.out.println("not palindrome");
        }
        

    }
    
}
