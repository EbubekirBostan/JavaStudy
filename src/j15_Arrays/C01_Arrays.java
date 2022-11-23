package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
        //Array Tanımlama
        int a;// declare edilen ama atnmayan primitive data
        int arr[];//declare edilen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılmaz...
        String isimArr[]={"bekir","enise","özge"};//hem tanımlama hem atama yapılan Strin array
        int sayiArr[]=new int[5];//java heap memory de 5 default->0 int array create edildi
        // yazdırırsak [0,0,0,0,0] verir
        //Array a Eleman Ekleme
        sayiArr[2]=34;
        sayiArr[0]=35;
        sayiArr[1]=34;
        sayiArr[3]=61;
        sayiArr[0]=34;// 0 index array elemanı update edildi.
        // array elemanları uniqe(farklı) olmak zorunda değildir.
        //array eleman sayısı boyut değeri
        System.out.println(sayiArr.length);//5
        //Array son elemanı
        System.out.println("isimArr[isimArr.length-1] = " + isimArr[isimArr.length - 1]);//özge
        isimArr[isimArr.length-1]="QA Özge hanım";// array son eleman update edildi.

        //Array de olmayan Eleman
      //okkalı TRİCK->  sayiArr[11]=23;// cte vermez ama olmayan eleman rte verir ->arra run time da oluşur
        // Array Elemanları Print etme
        System.out.println("isimArr[0] = " + isimArr[0]);
        System.out.println("isimArr[1] = " + isimArr[1]);
        System.out.println("isimArr[2] = " + isimArr[2]);
        for (int i = 0; i <isimArr.length ; i++) {
            System.out.print(isimArr[i]+" ");
        }
        System.out.println();
        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@2c6a3f77-> isimArr referans değeridir
        System.out.println(Arrays.toString(isimArr));//isim array stringe çevrildi.şuan sout yapılır ve yazdırır.
        // task-> sayıArr elemanlarından değeri tek olanları print eden code create ediniz
        for (int i = 0; i < sayiArr.length ; i++) {
            if (sayiArr[i]%2==1){
                System.out.println(sayiArr[i]);
            }

        }
        //task-> sayiArr cift index elemanları print eden code create ediniz
        for (int i = 0; i < sayiArr.length ; i+=2) {
            System.out.print(sayiArr[i]+" ");
        }
        //task-> isimArr 5 harfli elemanlarından oluşan arrayın elemanlarını print eden code create ediniz
        String yenArr[]=new String[isimArr.length];//isimArr elemanı kadar boş yeni bir arr
        int koltuksayisi=0;
        for (int i = 0; i < isimArr.length ; i++) {
            if (isimArr[i].length()==5){
                yenArr[i]=isimArr[i];
                koltuksayisi++;
            }
            System.out.println();
        }
        System.out.println("koltuksayisi = " + koltuksayisi);
        System.out.println(Arrays.toString(yenArr));
        //array elemanları naturel(k->b: ascending b-> k:descending, alfabetik) sıralama için sort(); methodu kullanılır.
        Arrays.sort(isimArr);//sıralama yapar
        System.out.println(Arrays.toString(isimArr));// sıralama yapılmış bır şekilde yazdırır
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr));


    }
}
