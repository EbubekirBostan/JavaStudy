package P11_depoYonetimi.Team04_depoYonetimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Methods {
    static int id=99;
    static HashMap<Integer, Urun> urunler=new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public  static void urunTanimlama(){
        System.out.println("Kaç urun eklemek istiyorsunuz: ");
        int secim= sc.nextInt();
        while (secim>=1){
            System.out.print("Ürün ismi giriniz: ");
            String isim=sc.next().toUpperCase();
            if(!urunler.containsValue(isim)){
                id++;
            }
            sc.nextLine();
            System.out.print("Üretici firmayı giriniz:");
            String uretici= sc.nextLine().toUpperCase();
            System.out.print("ürünün birimini giriniz");
            String birim= sc.nextLine().toUpperCase();
            System.out.print("Ürünün miktarinizi giriniz");
           int miktar= sc.nextInt();


            Urun urun= new Urun(isim,uretici,miktar,birim,null);
            urunler.put(id,urun);


            secim--;

            System.out.println(urunler);

        }

    }
    public static void urunListele(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println(urunler);
    }
    public static void urunGirisi(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println("ürün id si giriniz");
        int girId= sc.nextInt();
        System.out.println("Miktar giriniz");
        int mikt= sc.nextInt();

        if (urunler.containsKey(girId)){
            urunler.get(girId).setMiktar(urunler.get(girId).getMiktar()+mikt);
            System.out.println("Deponuza "+mikt+" kg "+urunler.get(girId).getUrunIsmi() +" girişi yapılmıştır");
        }else System.out.println("Bu id'de bir ürün yok canım");

    }
    public static void urunuRafaKoy(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println("Rafa eklenecek ürünün id'sini giriniz:");
        int rafId=sc.nextInt();
        urunler.get(rafId).setRaf(urunler.get(rafId).getUrunIsmi());
        System.out.println(urunler.get(rafId).getUrunIsmi()+" Ürününüz "+urunler.get(rafId).getRaf()+" Rafına Yerleştiriliyor..." );
        System.out.println(urunler);
    }
    public static void urunCikisi(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println("Çıkış yapılacak ürünün id'sini giriniz:");
        int cikisId=sc.nextInt();
        System.out.println("Miktar giriniz");
        int miktCikis= sc.nextInt();
        if (urunler.containsKey(cikisId)){
            if (urunler.get(cikisId).getMiktar()>=miktCikis){
               urunler.get(cikisId).setMiktar(urunler.get(cikisId).getMiktar()-miktCikis);
                System.out.println("Deponuzdan "+miktCikis+" kg "+urunler.get(cikisId).getUrunIsmi() +" çıkışı yapılmıştır");
            }else  System.out.println("Aradığınız miktara ulaşılamıyor");
        }


    }
}