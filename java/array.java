import java.util.Arrays;

public class array{
    public static void main(String[] args){
        int [] marks = new int[4];
        marks[0]=89;
        marks[1]=90;
        System.out.println(marks[0]);
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[1]);
    }
    
}