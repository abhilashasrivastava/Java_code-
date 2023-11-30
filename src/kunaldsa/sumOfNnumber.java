package kunaldsa;

public class sumOfNnumber {
    public static void main(String[] args) {
      int ans=sum(5);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0 || n==1){
            return 1;
        }
        int y=n+sum(n-1);
        return y;

    }
    }
