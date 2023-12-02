import java.util.*;
public class printmyname {
    public static void printMyName(String name){
        System.out.println(name);
        return;  // to going out of the function we use this return ;
    }
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name:");
        String name = sc.next();
    
        System.out.println("the name is:");
        printMyName(name);  // calling of function is always takes palce inside the main function;
    
    }
}
