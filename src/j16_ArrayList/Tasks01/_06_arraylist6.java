package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun. Parametre olarak Integer ArrayList Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;    ArrayList  5,4,6,2,1    2, 6'dan küçük ve 1 den büyüktür.    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> listSayilar=new ArrayList<>(List.of(5,4,6,2,1));
        System.out.println(hillNum(listSayilar));

    }

    private static List<Integer> hillNum(ArrayList<Integer> listSayilar) {
       List<Integer> sayı=new ArrayList<>();
        for (int i = 1; i < listSayilar.size()-1 ; i++) {
            if (listSayilar.get(i)<listSayilar.get(i-1) && listSayilar.get(i)>listSayilar.get(i+1)){
               sayı.add(listSayilar.get(i));
            }
        }
        return sayı;
    }
}

