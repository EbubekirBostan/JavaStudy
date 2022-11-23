package j29_Exceptions.Q02._01;

import java.util.ArrayList;
import java.util.Scanner;

public class ClarusWayMAin {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ClaruswayOkul okul=new ClaruswayOkul();
        System.out.println("Okul adını giriniz");
        okul.setOkulAdi(sc.nextLine());
        System.out.println("Öğrenci sayısınız Giriniz");
        okul.setMaxOgrenciSayisi(sc.nextInt());
        for (int i = 1; i <= okul.getMaxOgrenciSayisi() ; i++) {
            ClaruswayItOgrenci ogrenci=new ClaruswayItOgrenci();
            System.out.println("Ögrenci adını giriniz");
            ogrenci.setAd(sc.nextLine());
            System.out.println("Ögrenci soyadını giriniz");
            ogrenci.setSoyad(sc.nextLine());
            while (true){
                try {
                    System.out.println("Yaşınızı Giriniz");
                    ogrenci.setYas(sc.nextInt());
                    if (ogrenci.getYas()<8 || ogrenci.getYas()>15){
                        throw new Exception();
                    }else break;
                }catch(Exception e){
                    System.out.println("Öğrenci yaşı 8 ile 15 arasında olmalı");

                }
            }
            ClaruswayItOgrenci ogrenci1=new ClaruswayItOgrenci(ogrenci.getAd(), ogrenci.getSoyad(), ogrenci.getYas());
        }
        ClaruswayOkul okul1=new ClaruswayOkul(okul.getOkulAdi(), okul.getMaxOgrenciSayisi(), okul.getOgrenciler());
        okul.okullist.add(okul1);
        System.out.println("okul.okullist.toString() = " + okul.okullist.toString());


    }
}
