package P13_vatandasProject.Team_04_Vatandas_Project;

import java.util.HashMap;
import java.util.Scanner;

import static P11_depoYonetimi.Team04_depoYonetimi.Giris.B;

public class CitizenMethods {
    static Scanner sc=new Scanner(System.in);
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

   static String glnyuz = "\uD83D\uDE00";
   static String uzgn = "\uD83D\uDE0C";

    static  HashMap<String,Citizen> citizens=new HashMap<>();
     /*
		 saveInfo() method olusturun:
		 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
		 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.*/
    public static void saveInfo(){
        System.out.println("Kaç Kişi Eklemek İstiyorsunuz");
        String secim= sc.next();
        while (TryCatch.illegalArgumentExceptionEkleme(secim)){
            System.out.println("Kaç Kişi Eklemek İstiyorsunuz : ");
            secim=sc.next();
        }
            int sec=Integer.parseInt(secim);
        while (sec>0){
            System.out.println("Kimlik Numaranızı 4 Haneli Giriniz : ");
            String kimNo= sc.next();
            while (TryCatch.kimlik4LimitillegalArgument(kimNo)){
                System.out.println("Kimlik Numaranızı 4 Haneli Giriniz : ");
             kimNo= sc.next();
            }
            if (!citizens.containsKey(kimNo)){
                System.out.println("Ad-Soyad Giriniz : ");
                sc.nextLine();
                String adSoyad= sc.nextLine();
                System.out.println("Adresinizi Giriniz : ");
                String adres= sc.nextLine();
                System.out.println("Telefon Numaranızı Başında Sıfır Olmadan 10 Haneli Giriniz : ");
                String telNo= sc.nextLine();
                while (TryCatch.kimlik10LimitillegalArgument(telNo)){
                    System.out.println("Telefon Numaranızı Başında Sıfır Olmadan 10 Haneli Giriniz : ");
                    telNo=sc.nextLine();
                }
                Citizen vtnd=new Citizen(adSoyad,adres,telNo);
                citizens.put(kimNo,vtnd);
            }else {
                System.out.println("Bu Kimlik No Kullanılmaktadır Başka bir Kimlik No edininiz");
            }
            sec--;
            System.out.printf(B+"%10s %-20.10s %-30s %-10.10s \n", "Kimlik No ", " Ad-Soyad ", " Adres ", " Telefon ");
            System.out.println("===============================================================================");
            System.out.printf("%-10S %-20S %-30S %-10s\n"
                    ,kimNo,citizens.get(kimNo).getIsim(),
                            citizens.get(kimNo).getAdres(),citizens.get(kimNo).getTelefon());
        }

    }
    /* getInfo() method olusturun:
		 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.*/
    public static void getInfo(){
        System.out.println("Kimlik No Giriniz : ");
        String kimNo= sc.next();
        while (TryCatch.kimlik4LimitillegalArgument(kimNo)){
            System.out.println("Kimlik No giriniz : ");
            kimNo= sc.next();
        }
        if (citizens.containsKey(kimNo)){
            System.out.printf(B+"%10s %-20.10s %-30s %-10.10s \n", "Kimlik No ", " Ad-Soyad ", " Adres ", " Telefon ");
            System.out.println("===============================================================================");
            System.out.printf("%-10S %-20S %-30S %-10s\n"
                    ,kimNo,citizens.get(kimNo).getIsim(),
                    citizens.get(kimNo).getAdres(),citizens.get(kimNo).getTelefon());
        }else System.out.println("Kayıtlı Kimlik no bulunamadı");

    }/* removeInfo() method olusturun:
		 1)Kimlik numarasini girerek data silin.
		 2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
		 3)Collection bos ise kullaniciya hata mesaji verin.*/
    public static void removeInfo(){
        System.out.println("Kimlik No Giriniz : ");
        String kimNo= sc.next();
        while (TryCatch.kimlik4LimitillegalArgument(kimNo)){
            System.out.println("Kimlik No giriniz : ");
            kimNo= sc.next();
        }
        if (!citizens.isEmpty()){
            if (citizens.containsKey(kimNo)){
                citizens.remove(kimNo);
                System.out.println("Java Kanunları Gereğince Bütün Bilgileriniz Sistemden Silinmiştir ");
            }else System.out.println("Girdiğiniz Kimlik No Bulunmamaktadır");
        }else System.out.println("Veri Tabanı Boştur Kimlik No Edininiz");
    }
        /*selectOption() method olusturun:
		 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		*/
    public static void selectOption(){
        boolean flag=true;
        while (flag){
            System.out.println(G + "       ======="  + glnyuz + "GİT VATANDAŞ GİT PROGRAMI" + glnyuz + "======\r\n"
                    + "   ____________________              ____________________   \n"
                    + "   | 1-KİSİ OLUŞTUR   |              |    2-KİŞİ ARA    |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                    + "   ____________________              ____________________   \n"
                    + "   |    3-KİŞİ SİL    |              |     4-ÇIKIŞ      |   \n"
                    + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n" + R);
            String secim = sc.next();
            switch (secim) {
                case "1" :
                    saveInfo();
                    break;
                    case "2" :
                    getInfo();
                    break;
                    case "3" :
                    removeInfo();
                    break;
                    case "4" :
                        flag=false;
                        System.out.println("Çıkış Yaptınız Yine Beklemeyiz, Çok Öpüyorum Muhakkak Dön Bana");
                    break;
            }
        }

}
}
