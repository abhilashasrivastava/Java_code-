package OOPs.Polymorphism;

public class Circle extends Shapes {
    @Override // --> to check a fun is overridden or not
    void area(){
        System.out.println("area pie * r * r");
    }
}
