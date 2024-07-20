package OOPs.Access;

public class A {
    private int num;//obj.num // can't do this becuz num is set to be private only accessed
    //by getter and setter methods --> Data hiding
    String name;
    int [] arr;

    public int  getNum(){
        return num;
    }

    public void setNum(){
        this.num = num;
    }



    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }




}
