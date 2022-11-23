package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
   /*
   charAt() methodu parametre olarak girilen indexde ki char değerini return eder.
   index değeri 0dan başlar
    */
        String sehir="Istanbul";
        char besinciindex=sehir.charAt(5);
        System.out.println(besinciindex);
        System.out.println("sehir.charAt(5) = " + sehir.charAt(5));
        // son index karakteri>>> lenght()-1
        System.out.println(sehir.charAt(sehir.length() - 1));
        // ilk index >>>charAt(0)
        System.out.println(sehir.charAt(0));
       // System.out.println(sehir.charAt(18));//run time verir, index aşımı verir
        //TASK>>> istanbul izmir girilen kelimesinin ortadaki karakteri print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime=sc.nextLine();
        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length() - 1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");


    }
}
