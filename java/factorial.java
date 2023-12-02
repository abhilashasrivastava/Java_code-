import java.util.*;
public class factorial {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int f=1;
        
        final int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            
        f=f*i;
      
        }
        System.out.println(f);
        
    }
    
}
