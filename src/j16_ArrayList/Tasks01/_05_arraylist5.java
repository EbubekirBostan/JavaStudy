package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun. Parametre olarak String ArrayList
         ArrayList'in dizilişini terse döndürün. (Tersten yazdırın) Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> listSehir=new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        rotateList(listSehir);
    }

    private static void rotateList(ArrayList<String> listSehir) {
       // System.out.println("**1.yol***");
        //Collections.reverse(listSehir);
        //System.out.println(listSehir);
       // System.out.println("***2.yol***");
        List<String> listYeniSeher=new ArrayList<>();
        for (int i = listSehir.size()-1; i>=0; i--) {
            listYeniSeher.add(listSehir.get(i));
        }
        System.out.println("listYeniSeher = " + listYeniSeher);

    }
}

