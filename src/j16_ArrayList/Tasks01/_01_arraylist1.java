package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1 {

    /*
    ismi getCount() olan bir method oluşturun. Parametre olarak bir String ArayList  ve  bir tane String
    Return tipi int olmalı. ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
    Örneğin; ArrayList = Orange , Kiwi , Peach , Banana , Orange
    String Orange:         Count = 2 olmalı. (Orange 2 kez yazılmış)
     */

    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>(List.of("Orange","Kiwi","Peach","Banana","Orange"));
        String port="Orange";
        System.out.println("Count = " + getCount(fruits, port));//Count = 2
    }

    public static int getCount(ArrayList<String> fruits, String port) {
        int count=0;
        for (String a :fruits) {
            if (port.equalsIgnoreCase(a)){
                count++;
            }
        }
        return count;
    }
}
