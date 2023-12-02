import java.util.Scanner;
public class productF {
  /**
 * @param a
 * @param b
 * @return
 */
public static int productOfNumber(int a, int b){
        int product=a*b;
        return product;


    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();

        int product=productOfNumber(a,b);
        System.out.println(product);
    }
    
}

    

