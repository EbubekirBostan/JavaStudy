package j22_DateTime.Proje_Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {
    ArrayList<Kullanici> kullaniciKisiler=new ArrayList<>();//kullanıcı class'dan oluşturulacak obj tutulacağı list yapıldı
    // Task 2.stepp
    public ArrayList<Kullanici> kayitAl(){// Kullanıcı class'dan obj uretmek için cons. a gereken name ve kayıt zamani
        //bilgilerini oluşturup oluşan objeyi liste ekler
            Scanner sc=new Scanner(System.in);
            System.out.print("Adınızı Giriniz: ");
            String ad=sc.nextLine();// kullanıcı obj için name alındı
            Kullanici k1=new Kullanici(ad, LocalDateTime.now());// k1 obj name kullanıcıdan kayıtZamanını localdate time dan al
            kullaniciKisiler.add(k1);//olusturulan k1 objesi liste eklendi
            return kullaniciKisiler;
   }
   // task 3.stepp
   public  void  sansliKullanici(ArrayList<Kullanici> kllObj){// kullanıcı listesindeki objelerin kayıt zamanını 10
        //10 saniyeden az olup olmamasına göre sanslı kullanıcı olup olmadıgını belirleyecek
       for (Kullanici k:kllObj ){// kullanıcı class dan kayıtAl method ile üretilip list'e atılan objler döngüye alındı
           if (k.kayitZamani.getSecond()<=10){
               System.out.println(k.name+" agam şansli kişisin "+k.kayitZamani);
           }else System.out.println(k.name+" canımmm şanslı değilsin Öpüyorum seni Görüşmemek üzere "+k.kayitZamani);
       }

   }
   public void listele(ArrayList<Kullanici> kllObj){

        System.out.println(kllObj);
   }


}
