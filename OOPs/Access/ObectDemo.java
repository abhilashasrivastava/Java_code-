package OOPs.Access;
public class ObectDemo extends ObjectDemo {
    int num;
    int value;

    public ObectDemo(int i,int value) {
        this.num = num;
        this.value = value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();// unique representation od object via number
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return this.num == ((ObectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObectDemo obj = new ObectDemo(34,5);
        System.out.println(obj.hashCode());// gives some random value
        ObectDemo obj2 = new ObectDemo(45,4);
        //if(obj == obj2){
          //  System.out.println("equal");
        //}
        if(obj.equals(obj2)){
            System.out.println("equal");
        }
        System.out.println(obj.getClass());
    }
}
