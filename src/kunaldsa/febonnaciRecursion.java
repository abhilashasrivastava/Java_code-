package kunaldsa;

public class febonnaciRecursion {
    public static void main(String[] args) {
        int a=febbo(45);
        System.out.println(a);

    }
    static int febbo(int n){
        if(n<2){
            return n;
        }
        return febbo(n-1)+febbo(n-2);
    }
}
