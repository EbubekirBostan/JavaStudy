package j22_DateTime.Proje_Task;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {
    public void giris(){
        Scanner sc=new Scanner(System.in);
        Kayit yeniKayit=new Kayit();//Kayit Class'a erişim için p'siz cons.ile yenikayıt obj üretildi
        // Kayıt Class'dan obj call etmek için methodlar statik yapılırsa classname ile call edilebilir
        ArrayList<Kullanici> kisi=new ArrayList<>();//Kullanıcı Class' dan üretilen obj tutulacaği bos list.
        boolean cikilsinMi=true;// while döngü için şart oluşturuldu
        while (cikilsinMi){
            System.out.println(" Ne yapmak istiyorsunuz\n1->Kullanıcı Kayıt Al\n2->Şanslı Kişi Bul\n3->Listele\n4->Çıkış\nSeçer misin: ");
            int tercih=sc.nextInt();
            switch (tercih){
                case 1:
                    kisi=yeniKayit.kayitAl();// bu method kayıt class dan yeni kayıt obj ile kayıtAl method call edildi.
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=false;
                    break;
                default:
                    System.out.println("geçerli bir şey girin");
                    break;
            }



        }
    }
}
