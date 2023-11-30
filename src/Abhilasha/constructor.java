package Abhilasha;



class Dinner {
    String food;
    int prize;
    public void foodInfo() {
        System.out.println(this.food);
        System.out.println(this.prize);

    }
    //  Dinner(){
    //    System.out.println("yep");
    //}

    // Dinner(String food , int prize){
    // this.food=food;
    //this.prize=prize;
    Dinner(Dinner D2) {
        this.food = D2.food;
        this.prize = D2.prize;
    }

    Dinner() {
    }
}
public class constructor {
    public static void main(String[] args){
        Dinner D1= new Dinner();
        D1.food="ice";
        D1.prize=60;
        Dinner D2 = new Dinner(D1);
    //    di.food="chola bhatura";
       // di. prize=100;
      //  di2.food="ice cream";
      //  di2.prize=50;
        D2.foodInfo();
      //  di2.foodInfo();
    }
}
