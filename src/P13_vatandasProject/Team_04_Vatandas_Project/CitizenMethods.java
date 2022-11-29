package P13_vatandasProject.Team_04_Vatandas_Project;

import java.util.HashMap;
import java.util.Scanner;

public class CitizenMethods {
    static Scanner sc=new Scanner(System.in);
    static  HashMap<String,Citizen> citizens=new HashMap<>();
     /*
		 saveInfo() method olusturun:
		 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
		 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.*/
    public static void saveInfo(){
        System.out.println("Kaç Kişi Giriş yapmak istiyorsunuz");
        int secim=sc.nextInt();
        while (secim>0){
            System.out.println("Kimlik numaranızı giriniz : ");
            String kimNo= sc.next();
            if (!citizens.containsKey(kimNo)){
                System.out.println("Ad-Soyad giriniz : ");
                sc.nextLine();
                String adSoyad= sc.next();
                System.out.println("Adresinizi giriniz : ");
                String adres= sc.next();
                System.out.println("Telefon numaranızı giriniz : ");
                String telNo= sc.next();
                Citizen vtnd=new Citizen(adSoyad,adres,telNo);
                citizens.put(kimNo,vtnd);
            }else {
                System.out.println("Kimlik No Kullanılmaktadır Başka bir Kimlik No edininiz");
            }
            secim--;
        }
        System.out.println(citizens);
    }
    /* getInfo() method olusturun:
		 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.*/
    public static void getInfo(){
        System.out.println("Kimlik No Giriniz : ");
        String kimNo= sc.next();
        if (citizens.containsKey(kimNo)){
            System.out.print(kimNo +" "+ citizens.get(kimNo).getIsim() +" "+
                 citizens.get(kimNo).getAdres() +" "+citizens.get(kimNo).getTelefon());
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
            }else System.out.println("Girdiğiniz Kimlik no bulunmamaktadır");
        }else System.out.println("Veri tabanı boştur kimlik no edininiz");
        System.out.println(citizens);
    }
        /*selectOption() method olusturun:
		 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		*/
    public static void selectOption(){

    }



}
