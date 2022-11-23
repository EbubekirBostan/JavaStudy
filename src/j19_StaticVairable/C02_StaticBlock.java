package j19_StaticVairable;
 /*
        1.Static Block yapıları static varıable'rı değer ataması veya update için kullanılır
        2.Static Block Class oluşturuldugunda bütün methodlardan(main method dahil) önce çalışır.
        3.birden fazla static block varsa yukarıdan aşagıya sıralama ile çalışır
        */

public class C02_StaticBlock {
    static String isim;
    static {
        System.out.println("1. static blok çalıştı");
        isim="Dilek";
        System.out.println("isim = " + isim);
    }


    public static void main(String[] args) {
        System.out.println("main method başladı");
        isim="Kerem";
        System.out.println("isim = " + isim);
        System.out.println("main bitti");
    }
    static {
        System.out.println("2. static blok çalıştı");
        isim="Bekir";
        System.out.println("isim = " + isim);
    }


}
