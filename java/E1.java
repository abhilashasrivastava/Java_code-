import java.util.Scanner;
public class E1 {
    public E1() {
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= 0;
         do{
            System.out.println("enter the number to be checked:");
            n=sc.nextInt();
            System.out.println(n);
            
         }while(n>=0);
         
        System.out.println("number is negative");
    }
    
}
