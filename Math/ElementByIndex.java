package Math;

import java.util.ArrayList;

public class ElementByIndex {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(Add(num));

    }

    private static int Add(int num){
        if(num == 0){
            return 0;
        }
        int sum = 0;
        int n = num;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }
        if(sum > 0 && sum <= 9){
            return sum;
        }
        return Add(sum);
    }
}
