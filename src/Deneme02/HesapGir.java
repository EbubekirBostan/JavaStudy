package Deneme02;

import java.util.Scanner;

public class HesapGir{

    public void giris(){

        Hesap obj=new Hesap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Hangi işlemi yapmak istiyorsunuz (+) (-) (*) (/)");
        obj.secim=sc.next().charAt(0);
        if (obj.secim!='+'&&
                obj.secim!='-'&&
        obj.secim!='*'&&
        obj.secim!='/'){
            System.out.println("Lütfen Bir işlem seçiniz");
            giris();
        }
        System.out.print("İlk sayıyı Giriniz: ");
        obj.x= sc.nextInt();
        System.out.print("ikinci sayıyı Giriniz: ");
        obj.y= sc.nextInt();
        HesaplaMethodu obj1=new HesaplaMethodu();
        obj1.hesapla(obj.secim, obj.x, obj.y);

    }
}
