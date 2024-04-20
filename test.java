package kunaldsa;
import java.util.*;
public class test {
    public static void main(String[] args) {
       String S = "Ieai";
       int a = S.length()/2;
       int count = 0;
       int count1 = 0;
       String fh = S.substring(0,a);
       String sh = S.substring(a);
      for(int i = 0;i<fh.length();i++){
          char ch = fh.charAt(i);
          if(ch == 'A' || ch =='E' || ch =='O' || ch =='U' ||ch == 'E' || ch =='a' || ch == 'e' || ch == 'i' || ch =='o'|| ch == 'u'){
              count = count +1;
          }
      }
        for(int i = 0;i<sh.length();i++){
            char ch2 = sh.charAt(i);
            if(ch2 == 'A' || ch2=='E' || ch2 =='O' || ch2 =='U' ||ch2 == 'E' || ch2 =='a' || ch2 == 'e' || ch2 == 'i' || ch2=='o'|| ch2 == 'u'){
                count1 = count1 +1;
            }
        }
        if(count == count1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
        }
