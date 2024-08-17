package OOPs.Polymorphism;

public class Sum {
    int sum(int a, int b){
        return a + b;

    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(3,7,8));
    }
}
