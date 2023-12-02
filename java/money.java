import java.util.Scanner;
public class money {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Cash = sc.nextInt();
        if (Cash< 10){
            System.out.println("you could buy nothing");
            System.out.println("get more money to buy pen");
        }
        else if  (Cash>10 && Cash<40){
            System.out.println("you could buy pencil not pen");
        }
        else {
            System.out.println("you could buy pen and pencil both now");
        }
    
    }    
}
    
    

