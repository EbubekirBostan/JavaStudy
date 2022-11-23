package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)
    Example (Örnek):    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>(List.of(1,5,22,10,20,14,8,25,30,28));
        int min=20;
        int max=30;
        System.out.println("rangeBtw(numList,max,min) = " + rangeBtw(numList, max, min));
        /*
        count = 5
        rangeBtw(numList,max,min) = [20, 22, 25, 28, 30]
         */
    }

    private static List<Integer> rangeBtw(List<Integer> numList, int max, int min) {
        List<Integer> aralikList=new ArrayList<>();
        int count=0;
        for (int x:numList)
            if (x>=20 && x<=30){
                aralikList.add(x);
                count++;
            }
        System.out.println("count = " + count);
        Collections.sort(aralikList);
        return aralikList;
    }
}