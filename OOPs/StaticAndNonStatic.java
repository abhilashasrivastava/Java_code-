package OOPs;

public class StaticAndNonStatic {
    // ouside class cant be static because it does'nt depend on any other class
    public static void main(String[] args) {
        //greeting();// inside a static method you cannot use anything which is not static
        // if i put static void greeting() then it is ok because static inside static
        //something which is not belong to static is belong to classes


    }

    static void play(){
       // greeting(); // you cannnot use this beacause it requires instance
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.greeting(); // now you can access the non static data by explicilty
                       // creating object ot instances
    }
    void fun(){
        greeting(); // non static inside non static

    }

    void greeting(){
        System.out.println("hola");
        play(); // static inside non static ---> ok
    }
}
