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
        List<Integer> numList=new ArrayList<>(List.of(5,4,6,2,1));
        System.out.println("hillNum(numList) = " + hillNum(numList));//hillNum(numList) = [2]
    }

    private static List<Integer> hillNum(List<Integer> numList) {
        List<Integer> num=new ArrayList<>();
        for (int a=1 ; a<numList.size()-1 ; a++){
                if (numList.get(a)<numList.get(a-1) && numList.get(a)>numList.get(a+1)){
                    num.add(numList.get(a));
                }
            }
        return num;
    }

}

