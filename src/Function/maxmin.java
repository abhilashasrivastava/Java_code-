package Function;
import java.util.*;

public class maxmin {
    public static int printMx(int a,int b,int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }
    public static int printMn(int a, int b, int c) {
            int min;
            if(a<b && a<c){
                min=a;
            }
            else if(b<a && b<c){
                min=b;
            }
            else{
                min= c;

            }
            return min;
        }
        public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();

        int maximum=printMx(a,b,c);
            System.out.println("maximum"+maximum);
            int minimum=printMn(a,b,c);
            System.out.println("minimum"+minimum);
        }
    }

