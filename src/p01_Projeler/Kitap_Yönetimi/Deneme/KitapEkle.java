package p01_Projeler.Kitap_Yönetimi.Deneme;

import java.util.ArrayList;
import java.util.Scanner;

public class KitapEkle {
    public static int count=1000;
    ArrayList<EklenecekKitaplar> kitaplars=new ArrayList<>();



    public static ArrayList<EklenecekKitaplar> kitapEkle(){
        boolean flag=true;
       while (flag) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Kitap Adı Giriniz, Kitap Yazarı Giriniz, Fiyatı Giriniz, Çıkmak İçin 0 a basınız");
           String kitapIs = sc.nextLine();
           if (kitapIs.equals("0")){
               flag=false;
               break;
           }
           String yazarIs = sc.nextLine();
           int kFiyati = sc.nextInt();
       }

        return null;
    }

}
