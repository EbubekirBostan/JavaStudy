package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun. Parametresi ArrayList olmali. Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("Toplam = " + getsum(numList));//Toplam = 15
    }

    public static int getsum(ArrayList<Integer> numList) {
        int sum=0;
        for (int a:numList){
            sum+=a;
        }
        return sum;
    }
}
