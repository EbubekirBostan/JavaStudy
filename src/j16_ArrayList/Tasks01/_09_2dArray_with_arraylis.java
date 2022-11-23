package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:    Girdi:    [     [ 1, 2, 3 ],     [ 4, 5, 6 ],     [ 7, 8, 9 ]    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> numList=new ArrayList<>();
        for (int a[]:nums){
            for (int b:a)
                numList.add(b);
        }
        System.out.println("numList = " + numList);//numList = [1, 2, 3, 4, 5, 6, 7, 8, 9]



    }
}