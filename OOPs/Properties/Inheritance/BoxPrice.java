package OOPs.Properties.Inheritance;

public class BoxPrice extends BoxWieght {
    double cost;

    BoxPrice(){
        super();
        this.cost =- 1;

    }

    BoxPrice(BoxPrice other){  //old or other
        super(other);
        this.cost = other.cost;

    }
    BoxPrice(double l,double w, double h, double weight, double cost){
        super(l, w, h, weight);
        this.cost = cost;
    }

}
