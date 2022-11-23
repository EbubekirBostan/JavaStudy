package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String str="java bilen sırtı yere gelmez :) ";
        System.out.println(str.substring(10));
        // str datasının son 10 karakterini yazdırınız.
        System.out.println(str.substring(str.length() - 10));
        //str datasının ilk on karakterini yazdırınız
        System.out.println(str.substring(0,10));//0,1,2....9 karakteri alır
        // str ilk karakteri nasıl buluruz
        System.out.println(str.substring(0, 1));//0 alır 1 almaz

        //task<<<< girilen 4 harfli kelimeyi tersten yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli kelime giriniz");
        String kelime=scan.next();
        if (kelime.length()!=4){
            System.out.println("4 harfli kelime gir diyoruz");
        }else System.out.println("Yeni kelime : "+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));

    }
}
