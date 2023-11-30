package Abhilasha;
import java.util.*;

public class factorail {
    public static void printFact(int f) {
        System.out.println(f);
        return;
    }

        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int f=1;
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                f=f*i;
            }
            printFact(f);

        }

    }






