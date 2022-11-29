package P11_depoYonetimi.Team04_depoYonetimi;

import java.util.*;

import static P11_depoYonetimi.Team04_depoYonetimi.Giris.*;
import static P11_depoYonetimi.Team04_depoYonetimi.TryCatch.illegalArgumentExceptionEkleme;
import static P11_depoYonetimi.Team04_depoYonetimi.TryCatch.illegalArgumentExceptionEklemeString;


public class Methods  {
    static int id=99;
    static HashMap<Integer, Urun> urunler=new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public  static void urunTanimlama(){
        System.out.println("Kaç urun eklemek istiyorsunuz: ");
        String secim= sc.nextLine();
        while (illegalArgumentExceptionEkleme(secim)){
            System.out.println("Kaç urun eklemek istiyorsunuz: ");
            secim=sc.nextLine();
        }
        int sec=Integer.parseInt(secim);
        while (sec>0){
            System.out.print("Ürün ismi giriniz : ");
            String isim=sc.next().toUpperCase();
            sc.nextLine();
            System.out.print("Üretici firmayı giriniz : ");
            String uretici= sc.next().toUpperCase();
            System.out.print("Ürünün Birimini(Kasa,Çuval) Giriniz : ");
            String birim= sc.next().toUpperCase();
            while (illegalArgumentExceptionEklemeString(birim)){
                System.out.print("Ürünün Birimini(Kasa,Çuval) Giriniz : ");
                birim=sc.next();
            }
            System.out.print("Ürünün miktarini giriniz : ");
           String miktar= sc.next();
            while (illegalArgumentExceptionEkleme(miktar)){
                System.out.print("Ürünün miktarini giriniz : ");
                miktar=sc.next();
            }
            System.out.println("\n\n");
           int miktar1=Integer.parseInt(miktar);

            if(!urunler.containsValue(isim)){
                id++;
            }
            Urun urun= new Urun(isim,uretici,miktar1,birim,null);
            urunler.put(id,urun);
            sec--;
           urunListele();
            System.out.println("\n\n");
        }

    }
    public static void urunListele(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.printf(B+"%-9s %-10s %-10s %-10s %-10s %-10s\n", "ID", " Ürün", " Üretici", "Miktar", "Birim", "Raf");
        System.out.println("====================================================================================");
        Set<Integer> keySets = urunler.keySet();
        Collection<Urun> valueSet = urunler.values();
        for (Integer each : keySets) {
            List<Urun> valuesList = new ArrayList<>();
            valuesList.add(urunler.get(each));
            int index = 0;
            while (index < valuesList.size()) {
                System.out.printf("%-9s %-10s %-10s %-10d %-10s %-10s\n", each, valuesList.get(index).getUrunIsmi(), valuesList.get(index).getUretici(),
                        valuesList.get(index).getMiktar(), valuesList.get(index).getBirim(), valuesList.get(index).getRaf());
                index++;
            }
        }
    }
    public static void urunGirisi(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println("ürün id si giriniz : ");
        String id= sc.next();
        while (illegalArgumentExceptionEkleme(id)){
            System.out.print("ürün id si giriniz : ");
            id=sc.next();
        }
        int girId=Integer.parseInt(id);
        System.out.println("Miktar giriniz : ");
        String miktar= sc.next();
        while (illegalArgumentExceptionEkleme(miktar)){
            System.out.print("Miktar giriniz : ");
            miktar=sc.next();
        }
        int mikt= Integer.parseInt(miktar);
        if (urunler.containsKey(girId)){
            urunler.get(girId).setMiktar(urunler.get(girId).getMiktar()+mikt);
            System.out.println("Deponuza "+mikt+" kg "+urunler.get(girId).getUrunIsmi() +" girişi yapılmıştır");
        }else System.out.println("Bu id'de bir ürün yok canım");
        urunListele();

    }
    public static void urunuRafaKoy(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println("Rafa eklenecek ürünün id'sini giriniz : ");
        String id=sc.next();
        while (illegalArgumentExceptionEkleme(id)){
            System.out.print("Rafa eklenecek ürünün id'sini giriniz : ");
            id=sc.next();
        }
        int rafId=Integer.parseInt(id);
        if (urunler.containsKey(rafId)){
            urunler.get(rafId).setRaf(urunler.get(rafId).getUrunIsmi());
            System.out.println(urunler.get(rafId).getUrunIsmi()+" Ürününüz "+urunler.get(rafId).getRaf()+" Rafına Yerleştiriliyor..." );
        }else System.out.println("Bu id ile eşleşen bir raf yok canım");
        urunListele();
    }
    public static void urunCikisi(){
        if (urunler.isEmpty()){
            System.out.println("Ürün olmadığı için Ürün Tanımlamaya Yönlendiriliyorsunuz");
            urunTanimlama();
        }
        System.out.println("Çıkış yapılacak ürünün id'sini giriniz : ");
        String id=sc.next();
        while (illegalArgumentExceptionEkleme(id)){
            System.out.print("Çıkış yapılacak ürünün id'sini giriniz : ");
            id=sc.next();
        }
        int cikisId=Integer.parseInt(id);
        System.out.println("Miktar giriniz : ");
        String miktar= sc.next();
        while (illegalArgumentExceptionEkleme(miktar)){
            System.out.print("Miktar giriniz : ");
            miktar=sc.next();
        }
        int miktCikis= Integer.parseInt(miktar);
        if (urunler.containsKey(cikisId)){
            if (urunler.get(cikisId).getMiktar()>=miktCikis){
               urunler.get(cikisId).setMiktar(urunler.get(cikisId).getMiktar()-miktCikis);
                System.out.println("Deponuzdan "+miktCikis+" kg "+urunler.get(cikisId).getUrunIsmi() +" çıkışı yapılmıştır");
            }else  System.out.println("Aradığınız miktara ulaşılamıyor");
        }System.out.println("Bu id ile eşleşen bir ürün yok canım");
        urunListele();


    }
}