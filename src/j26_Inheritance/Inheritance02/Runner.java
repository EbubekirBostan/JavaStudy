package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance01.Koyun;
import j26_Inheritance.Inheritance01.Paluk;

public class Runner {

    public static void main(String[] args) {
     Kedi k1= new Kedi();
        System.out.println("k1.a = " + k1.a);//0 > hayvancıktan geldi
        System.out.println("k1.c = " + k1.c);//2 > kediden geldi
        System.out.println("k1.d = " + k1.d);//5 > kediden geldi
        System.out.println("k1.m = " + k1.m);//1 > mamal dan geldi
        /*
        Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
         */
        k1.mA();//hayvancık class call
        k1.mC();//kedi class call
        k1.mM();//mammal class call
        /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */


        Memeli k2=new Kedi("a");
        System.out.println("k2.c = " + k2.c);//4
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.m = " + k2.m);//1
       // k2.d-> Cte verir data type Mammal class d variable yok call edilemez
         k2.mA();// mA - > HAYVANCIK  class meth call.
         k2.mC();//mC - > Kedi  class meth call.
         k2.mM();// mM - > Mammal  class meth call.
         Hayvancik k3=new Kedi();

         System.out.println("k3.m = " + k3.m);//3
         System.out.println("k3.a = " + k3.a);//0
       // k3.c-> datatype hayvancık class cte verir
         k3.mA();// hayvancık class call edildi
         k3.mM();// mamal class call edildi
         Memeli m1=new Memeli('$');
       System.out.println("m1.m = " + m1.m);//1
       System.out.println("m1.a = " + m1.a);//0
       System.out.println("m1.c = " + m1.c);//4
       // d gelmez childin özelliğini baba kullanamaz
       m1.mA();//hayvancık
       m1.mC();//mammal
       m1.mM();//mammal

    }
}
