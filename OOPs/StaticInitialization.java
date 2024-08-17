package OOPs;

public class StaticInitialization {
    //to show initialization of static variables
    static int a = 4;
    static int b;
     // tis static block exactly executed once when this
    // this classs is loaded
    static{
        System.out.println("hello");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialization ob = new StaticInitialization();
        System.out.println(StaticInitialization.a + StaticInitialization.b);


    }
}
