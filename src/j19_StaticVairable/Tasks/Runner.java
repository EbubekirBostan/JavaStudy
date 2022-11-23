package j19_StaticVairable.Tasks;

public class Runner {
    public static void main(String[] args) {
        T01_Rectangle arsa=new T01_Rectangle(20,40);
        arsa.alanHesap();//Alan = 800.0 metrekaredir
        arsa.cevreHesap();//Cevre Uzunlugu = 120.0 metredir

        T02_ElektrikHesap hesapEt=new T02_ElektrikHesap();
        T02_Musteri musteri=new T02_Musteri("Tsuz Deli Bekir",hesapEt);
        hesapEt.tuketimEkle();
        hesapEt.tuketimEkle();
        System.out.println(musteri.name + " in Tüketimi = " + musteri.t02_elektrikHesap.toplamTuketim);
        System.out.println(musteri.name + " in Faturası = " + musteri.t02_elektrikHesap.odenecekTutar());
    }
}
