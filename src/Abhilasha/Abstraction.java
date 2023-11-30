package Abhilasha;
abstract class Cake{
    Cake() {
        System.out.println("yo yrr");
    }
    public void flavour(){


    }
}
class Theme extends Cake{
    Theme(){
        System.out.println("how are you?");
    }
    public void flavour(){
        System.out.println("delicious");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Theme theme = new Theme();
        theme.flavour();

    }
}



