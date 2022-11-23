package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {


    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan büyük olanları print eden method create ediniz.

        List<Double> sayilar=new ArrayList<>();
        boolean flag=true;
        while (flag) {
                Scanner sc=new Scanner(System.in);
            System.out.println("Sayı giriniz. Çıkmak için 0 a basınız.");
            double sayi= sc.nextDouble();
            if (sayi!=0){
                sayilar.add(sayi);
            }else flag=false;
        }
        System.out.println("sayilar = " + sayilar);
        double ortalama1=0;
        for (double x:sayilar){
            ortalama1+=x;
        }
        ortalama1/= sayilar.size();
        System.out.println("ortalama = " + ortalama1);
        List<Double> newNums=new ArrayList<>();
        for (double y:sayilar){
            if (y>ortalama1){
                newNums.add(y);
            }
        }
        System.out.println("newNums = " + newNums);





    }
}
