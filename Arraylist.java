package DSA;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args){
        int n=5;
        ArrayList<Integer> list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
