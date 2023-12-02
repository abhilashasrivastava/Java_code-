class Pen{
    String color;
    String type;
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Myinfo{
    String name;
    int age;
    public void meInfo(){
        
        System.out.println(this.name);
        System.out.println(this.age);

    }
}
public class OOPS {
    public static void main( String[] args){
      //  Pen pen1 = new Pen();
      //  pen1.color="black";
        //pen1.type="ballpoint";
       // Pen pen2 = new Pen();
        //pen2.color="blue";
        //pen2.type="gel";
       // pen1.printInfo();
       // pen2.printInfo();
       Myinfo m1=new Myinfo();
       m1.name="Abhilasha";
       m1.age=18;
       m1.meInfo();
    }
    
}
