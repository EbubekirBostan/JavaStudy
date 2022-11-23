package P11_depoYonetimi.Team04_depoYonetimi;

import java.util.HashMap;
import java.util.Scanner;

public class Methods {
    static int id=99;
    static HashMap<Integer, Urun> urunler=new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public  static void urunTanimlama(String isim,String uretici,String birim,int miktar){
        System.out.println("Kaç urun eklemek istiyorsunuz: ");
        int secim= sc.nextInt();
        while (secim>=1){
            if(!urunler.containsValue(isim)){
                id++;
            }
            System.out.print("Ürün ismi giriniz: ");
            isim=sc.next();
            sc.nextLine();
            System.out.print("Üretici firmayı giriniz:");
            uretici= sc.nextLine();

            System.out.print("ürünün birimini giriniz");
            birim= sc.nextLine();
            System.out.print("Ürünün miktarinizi giriniz");
            miktar= sc.nextInt();


            Urun urun= new Urun(isim,uretici,miktar,birim,null);
            urunler.put(id,urun);


            secim--;

            System.out.println(urunler);

        }

    }
    public static void urunListele(HashMap<Integer, Urun> urunler){
        System.out.println(urunler);
    }
    public static void urunGirisi(HashMap<Integer, Urun>urunler){
        System.out.println("ürün id si giriniz");
        int girId= sc.nextInt();
        System.out.println("Miktar giriniz");
        int mikt= sc.nextInt();
        int bizimMiktar=urunler.get(girId).getMiktar();
        if (urunler.containsKey(girId)){
            urunler.get(girId).setMiktar(bizimMiktar+mikt);
        }else System.out.println("Bu id'de bir ürün yok canım");

    }
    public static void urunuRafaKoy(HashMap<Integer, Urun> urunler){

        System.out.println("Rafa eklenecek ürünün id'sini giriniz:");
        int rafId=sc.nextInt();
        String bizimRaf=urunler.get(rafId).getRaf();
        if(urunler.containsKey(rafId)){
            urunler.get(rafId).setRaf("A");
        }
}
}