package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;
public class function_arraylist {
     public static void main(String[] args){


            ArrayList<Integer> list=new ArrayList<Integer>();
            //add
            list.add(0);
            list.add(1);
            list.add(9);
            list.add(6);
            list.add(7);
            System.out.println(list);
            // get
        System.out.println (list.get(0));
         // add element in between
         list.add(1,4);
         System.out.println(list);
         //set element
         list.set(0,4);
         System.out.println(list);

         //deleete
         list.remove(3);
         System.out.println(list);

         //size
         int size=list.size();
         System.out.println(size);

        //loops

      for(int i=0;i<list.size();i++){
          System.out.println(list.get(i));
      }
          Collections.sort(list);
         System.out.println(list);
        }}


