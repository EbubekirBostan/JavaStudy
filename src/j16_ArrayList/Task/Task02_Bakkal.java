package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02_Bakkal {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
        Scanner sc=new Scanner(System.in);
        List<String> gunList=new ArrayList<>(List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
        List<Integer> gunKazan=new ArrayList<>();
        int gun=0;
        while (gun<gunList.size()){
            System.out.print(gunList.get(gun)+ " Kazancını Giriniz = ");
            gunKazan.add(sc.nextInt());
            gun++;
        }
        System.out.println("Ortalama Kazancınız = " + getOrtalamaKazanc(gunKazan, gunList));
        System.out.println("Ortalamanin Ustunde Kazanc Gunleri= " + getOrtalamaninUstundeKazancGunleri(gunList, gunKazan));
        System.out.println("Ortalamanin Altinda Kazanc Günleri = " + getOrtalamaninAltindaKazancGunleri(gunList, gunKazan));
    }

    private static List<String> getOrtalamaninAltindaKazancGunleri(List<String> b, List<Integer> a) {
        List<String> ortAlt=new ArrayList<>();
        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i)<getOrtalamaKazanc(a, b)){
                ortAlt.add(b.get(i)+" = "+a.get(i));
            }
        }
        return ortAlt;
    }

    public static List<String> getOrtalamaninUstundeKazancGunleri(List<String> b, List<Integer> a) {
        List<String> ortUst=new ArrayList<>();
        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i)>=getOrtalamaKazanc(a, b)){
                ortUst.add(b.get(i)+" = "+a.get(i));
            }
        }
        return ortUst;
    }

    public static double getOrtalamaKazanc(List<Integer> a, List<String> b) {
        double tpl=0;
        for (int i = 0; i <b.size() ; i++) {
            tpl+=a.get(i);
        }double ortlm=tpl/b.size();
        return ortlm;
    }
}
