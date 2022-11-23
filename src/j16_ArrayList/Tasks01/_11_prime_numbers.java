package j16_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.
        Örnek 1:        n = 20
        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:        Input(Girdi): 10        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Negatif olmayan bir sayı giriniz");
        int num=sc.nextInt();
        List<Integer> asalList=new ArrayList<>();
        int count=0;
        for (int i = 2; i <num ; i++) {
            if (i!=2 && i!=3){
                if(i%2==1 && i%3!=0){
                    asalList.add(i);
                    count++;
                }
            }else {
                asalList.add(i);
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("asalList = " + asalList);

    }
}
