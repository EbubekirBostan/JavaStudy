package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    public static void main(String[] args) {
        System.out.println("TASK01--> amele topla : "+toplaAmele(10));//55
        System.out.println("  ****  ");
        System.out.println("TASK01--> cincix topla : "+toplaCincix(10));//55
        System.out.println("TASK02--> cincix çift topla : "+toplaCift(24));//156
        System.out.println("TASK03--> cincix ilk 10 çift topla : "+toplaIlkXSayi(10));
        System.out.println("TASK04--> cincix ilk 10 tek topla : "+toplaIlkXTekSayi(10));
        ikininKuvvetleri(7);
        istenenSayiXKuvveti(7,5);

    }//main sonu

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured Programming(Amele coding...)
    public static int toplaAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }
    //Functional Programming(cincix code...)
    public static int toplaCincix(int x){

       return IntStream.//manual akıs tanımlandı
                range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz
    public static int toplaCift(int x){

        return IntStream.//manual akıs tanımlandı
               // range(1,x+1).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                rangeClosed(1,x).//1 dahil x+1 hariç-> 1,2,3...x int sayılarından aralık tanımlandı
                filter(C01_LambdaExpression::ciftMi).//akısdaki tamsayıların çift olanları akısa alındı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
        //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkXSayi(int x){
      return IntStream.iterate(2,t->t+2).//2'den başlayıp 2 artırılan tekrar işlemi tanımlandı. sonsuza kadar gider
                limit(x).//akışdaki ilk x eleman akışa alınır.
                sum();
    }
//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
public static int toplaIlkXTekSayi(int x){
    return IntStream.iterate(1,t->t+2).//1'den başlayıp 2 artırılan tekrar işlemi tanımlandı. sonsuza kadar gider
            limit(x).//akışdaki ilk x eleman akışa alınır.
            sum();
}
//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz
            public static void ikininKuvvetleri(int x){
     IntStream.iterate(2,t->t*2).limit(x).forEach(C01_LambdaExpression::yazdir);
    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static OptionalInt istenenSayiXKuvveti(int istenenSayi, int x){
       return IntStream.
                iterate(istenenSayi,t->t*istenenSayi).//istenen sayıdan başlayıp istenen sayı ile çarpı tekrar
                limit(x).//kuvveti tanımlandı
                skip(x-1).//istenen sonuçtan önceki sayılar atlandı
                findFirst();
    }




}