package j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */
        String str1="JAVA";
        String str2="CAVA";
        if (str1==str2) {
            System.out.println("String 1 is equal to String 2");
        }
        if (str1!=str2) {
            System.out.println("String 1 is NOT equal to String 2");// 18. satır yazıldı
        }




    }
}
