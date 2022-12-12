package j11_MethodCreation;

import static j11_MethodCreation.JavaTekrar4.sc;

public class JavaTekrar3 {
    public static void main(String[] args) {
        System.out.println("Adınızı Giriniz");
        String ad=sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Soyadınızı Giriniz");
        String lastName=sc.nextLine();
        JavaTekrar4 meth=new JavaTekrar4();
        meth.ilkHarfBuyuk(name,lastName);
    }
}
