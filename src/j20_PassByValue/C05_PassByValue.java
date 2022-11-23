package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
        eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
        2.değişklik  yapılan variable'lara atama yapılır.
        */
        double etiketFiyati=100;//primitive
        double indirimOrani=0.1;//primitive
        System.out.println("indirim öncesi etiketFiyati = " + etiketFiyati);
        etiketFiyati=indirim(etiketFiyati,indirimOrani);// atama yapıldığı için alttaki soutta fiyat değişir.
        System.out.println("indirim sonrası etiketFiyati = " + etiketFiyati);


    }
    public static double indirim(double fiyat, double oran){
      fiyat*=(1-oran);
        System.out.println("indirimli fiyat = " + fiyat);
        return fiyat;
    }



}
