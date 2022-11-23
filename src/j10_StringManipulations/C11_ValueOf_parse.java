package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
        // task>>>> string type verilen iki adet bağış miktarını toplayan code create ediniz.

        String bagis1="1500";
        String bagis2="2500";
        int yeniBgis1=Integer.valueOf(bagis1);
        int yeniBgis2=Integer.valueOf(bagis2);
        System.out.println("Toplam : "+(yeniBgis1+yeniBgis2));
        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);
        System.out.println(Integer.parseInt(bagis1) + Integer.parseInt(bagis2));

        int tc=1234567;
        String strTc=String.valueOf(tc);
        System.out.println("strTc = " + strTc);
        System.out.println("strTc+tc = " + strTc + tc);
        String fiyat="$150";
        String yenfyt=fiyat.replace("$","");
        int yeniFiyat=Integer.valueOf(yenfyt);
        System.out.println("yeniFiyat = " + yeniFiyat);


    }
}
