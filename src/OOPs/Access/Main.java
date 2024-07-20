package OOPs.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A( 10, "abhi");
        //obj.num // can't do this becuz num is set to be private only accessed
        //by getter and setter methods

        obj.getNum();
    }
}
