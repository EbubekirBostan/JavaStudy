package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
         task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
         */
        //Task01
        List<Integer> l1=new ArrayList<>(Arrays.asList(3,7,6,5,2,8,4));
        ListIterator<Integer> it=l1.listIterator();
        while (it.hasNext()){
         if (it.next()%2==0){
             it.remove();
         }
        }
        while (it.hasPrevious()){
          System.out.print( (int) Math.pow(it.previous(), 2)+" ");
      }




    }
}
