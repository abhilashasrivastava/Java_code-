import java.util.Scanner;
public class vote {
    public static void main(String[] args){
    System.out.println("enter age:");
    Scanner sc= new Scanner(System.in);
    int age =sc.nextInt();
    if (age<18){
    System.out.println("is not eligible for vote");
    }
    else{
    System.out.println("is eligible for vote");
    }

}
}