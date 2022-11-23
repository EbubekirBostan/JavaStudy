package Day07;

import java.util.Scanner;

public class Q01_WhileDoWhile {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=sc.nextInt();
       // System.out.println(basTpl(sayi));
        System.out.println(foriletop(sayi));
    }

    private static int foriletop(int sayi) {
        int tpl=0;
        for (int i = sayi; sayi>0 ; sayi/=10) {
            tpl+=sayi%10;

        }
        return tpl;
    }

    private static int basTpl(int sayi) {
        int tpl=0;
        while (sayi!=0){
            tpl+=sayi%10;
            sayi/=10;
        }
        return tpl;
    }
}
