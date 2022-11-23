package Day03;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {
        // Girilen Uc Haneli bir sayinin okunsunu yazi ile yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamaklı bir sayı giriniz");
        int num=scan.nextInt();
        int yuzlerbas=num/100, onlarbas=(num/10)%10, birlerbas=num%10;
        if (num>99&&num<1000){
            switch (yuzlerbas){
                case 0: System.out.println(" ");break;
                case 1: System.out.println("yuz");break;
                case 2: System.out.println("ikiyuz");break;
                case 3: System.out.println("üçyüz");break;
                case 4: System.out.println("dörtyüz");break;
                case 5: System.out.println("beşyüz");break;
                case 6: System.out.println("altıyüz ");break;
                case 7: System.out.println("yediyüz ");break;
                case 8: System.out.println("sekizyüz ");break;
                case 9: System.out.println("dokuzyüz ");break;
            }
            switch (onlarbas){
                case 0: System.out.println(" ");break;
                case 1: System.out.println("on");break;
                case 2: System.out.println("yirmi");break;
                case 3: System.out.println("otuz");break;
                case 4: System.out.println("kırk");break;
                case 5: System.out.println("elli");break;
                case 6: System.out.println("altmış ");break;
                case 7: System.out.println("yetmiş ");break;
                case 8: System.out.println("seksen ");break;
                case 9: System.out.println("dokuz ");break;
            }
            switch (birlerbas){
                case 0: System.out.println(" ");break;
                case 1: System.out.println("bir");break;
                case 2: System.out.println("iki");break;
                case 3: System.out.println("üç");break;
                case 4: System.out.println("dört");break;
                case 5: System.out.println("beş");break;
                case 6: System.out.println("altı ");break;
                case 7: System.out.println("yedi ");break;
                case 8: System.out.println("sekiz ");break;
                case 9: System.out.println("dokuz ");break;
            }

        }else System.out.println("lütfen 3 basamaklı sayı giriniz");











    }
}
