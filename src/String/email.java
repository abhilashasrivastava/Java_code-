package String;
import java.util.*;

public class email {

    public static  void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String email= sc.nextLine();
        String name="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
               break;
            }
            name+=email.charAt(i);
        }
           System.out.println("The name is :" + name);
    }
}
