package j20_PassByValue;

public class C04_PassByValue {
    static double etiketFiyati;
    static double indirimOrani;
    public static void main(String[] args) {
        /*
        eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
        1.değişiklik yapılan variable'lar static olarak tanımlanır.
         */
        etiketFiyati=100;
        System.out.println("indirim öncesi = " + etiketFiyati);
        indirimOrani=0.1;
        indir();

        indirimOrani=0.1;
        indir();

        indirimOrani=0.1;
        indir();
        System.out.println("indirim sonrası = " + etiketFiyati);
    }//main son
    public static void indir(){
        etiketFiyati*=(1-indirimOrani);
        System.out.println("etiketFiyati = " + etiketFiyati);

    }
}
