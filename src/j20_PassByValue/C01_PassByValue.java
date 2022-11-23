package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir proglama dilidir.
        Bir Primitive variable argument ya da parametre olarak bir methoda call edildiğinde variable
        değil bir copy clone(vesikalık)(pointer)değeri gönderilir.
         */
        //task- > verilen fiyat için %24 arttırılmış fiyatı print eden method create ediniz.

        double fiyat=100;
        System.out.println("method call öncesi fiyat değeri = " + fiyat);//100
        fiyatArttir(fiyat);//fiyat variable methoda parametre call edildi
        System.out.println("method call öncesi fiyat değeri = " + fiyat);//100
    }

    public static void fiyatArttir(double x){
        x*=1.24;
        System.out.println("Arttırılmış fiyat = " + x);
    }
}
