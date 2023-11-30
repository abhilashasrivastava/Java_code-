package Abhilasha;
interface Student{
    void name();
}
class Section implements Student{
    public void name(){
        System.out.println("your name");
    }
}



public class Interface {
    public static void main(String[] args){
        Section section =new Section();
        section.name();
    }
}
