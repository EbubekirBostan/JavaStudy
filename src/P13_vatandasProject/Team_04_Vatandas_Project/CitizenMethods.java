package P13_vatandasProject.Team_04_Vatandas_Project;

import java.util.HashMap;
import java.util.Scanner;

public class CitizenMethods {
    static Scanner sc=new Scanner(System.in);
    public static final String R = "\u001B[31m";
    static  HashMap<String,Citizen> citizens=new HashMap<>();
     /*
		 saveInfo() method olusturun:
		 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
		 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.*/
    public static void saveInfo(){
        System.out.println("Kaç Kişi Giriş yapmak istiyorsunuz");
        String secim= sc.next();
        while (TryCatch.illegalArgumentExceptionEkleme(secim)){
            System.out.println("Kaç Kişi Giriş yapmak istiyorsunuz");
            secim=sc.next();
        }
            int sec=Integer.parseInt(secim);
        while (sec>0){
            System.out.println("Kimlik numaranızı giriniz : ");
            String kimNo= sc.next();
            while (TryCatch.kimlik4LimitillegalArgument(kimNo)){
                System.out.println("Kimlik numaranızı giriniz : ");
             kimNo= sc.next();
            }
            if (!citizens.containsKey(kimNo)){
                System.out.println("Ad-Soyad giriniz : ");
                sc.nextLine();
                String adSoyad= sc.nextLine();
                System.out.println("Adresinizi giriniz : ");
                String adres= sc.nextLine();
                System.out.println("Telefon numaranızı giriniz : ");
                String telNo= sc.nextLine();
                Citizen vtnd=new Citizen(adSoyad,adres,telNo);
                citizens.put(kimNo,vtnd);
            }else {
                System.out.println("Kimlik No Kullanılmaktadır Başka bir Kimlik No edininiz");
            }
            sec--;
            System.out.printf("%-10S %-10S %-10s %-10s\n"
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
        if (citizens.containsKey(kimNo)){
            System.out.printf("%-10S %-10S %-10s %-10s\n"
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
        if (!citizens.isEmpty()){
            if (citizens.containsKey(kimNo)){
                citizens.remove(kimNo);
                System.out.println("Java kanunları gereğince ");
            }else System.out.println("Girdiğiniz Kimlik no bulunmamaktadır");
        }else System.out.println("Veri tabanı boştur kimlik no edininiz");
        System.out.println(citizens);
    }
        /*selectOption() method olusturun:
		 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		*/
    public static void selectOption(){
        boolean flag=true;
        while (flag){
            System.out.println(R+"------- Menu -------"+
                    "\n1- Kisi Olustur"+
                    "\n2- Kisi Ara" +
                    "\n3- Kisi Sil"+
                    "\n4- Cikis\n");
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
                        System.out.println("Çıkış yaptınız yine Beklemeyiz, Çok öpüyorum muhakkak dön bana");
                    break;
            }
        }

}
}
