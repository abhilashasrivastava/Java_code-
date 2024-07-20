package OOPs.Properties.Inheritance;

public class BoxWieght extends Box {
    double weight;

    public BoxWieght(){
        this.weight = -1;
    }
    public BoxWieght(double l, double w, double h,double weight){
         super(l, h, w); // calling th// e parent class constructor
        this.weight = weight;
        System.out.println(super.w );

    }

    public BoxWieght(BoxWieght other) {
        //super(other);
    }
}
