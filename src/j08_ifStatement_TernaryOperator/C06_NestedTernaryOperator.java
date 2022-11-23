package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=scan.nextInt();
        System.out.println(a>=0 ? (a<10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi");











    }
}
