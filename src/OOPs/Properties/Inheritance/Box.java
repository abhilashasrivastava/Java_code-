package OOPs.Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        super();// this will call an object above box() class initialized by java internally
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l,double h, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
}
