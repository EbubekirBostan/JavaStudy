package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner input=new Scanner(System.in);
        System.out.println("bir banka hesabınız var mı?");
        boolean var;
        boolean yok;
        if (input.hasNext()) var = true;
        else var = false;
        if (input.hasNext()) yok = false;
        else yok=true;
        System.out.println("var = " + var+ ", yok="+yok);




    }
}
