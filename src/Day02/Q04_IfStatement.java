package Day02;

import java.util.Scanner;

public class Q04_IfStatement {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Y veya N harfi giriniz");
        char karakter=sc.next().charAt(0);
        if (karakter=='Y' || karakter=='y'){
            System.out.println("YES");
        } else if (karakter=='N' || karakter=='n') {
            System.out.println("NO");
        }else {
            System.out.println("yanlış giriş yaptınız tekrar deneyiniz");
        }


    }
}
