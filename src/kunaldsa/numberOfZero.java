package kunaldsa;

public class numberOfZero {
    static int count=0;
    public static void main(String[] args) {
        int ans=print(1006750);
        System.out.println(ans);

    }
    static int print(int n){
        if(n==0){
            return 0;
        }

       int  rem=n%10;
       if(rem==0){
           count++;

       }
       print(n/10);
       return count;
    }
}
