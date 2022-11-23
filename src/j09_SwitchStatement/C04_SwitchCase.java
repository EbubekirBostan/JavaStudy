package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Girilen Ayın hangi mevsimde oldugunu söyleyen code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("oldugunuz ayı sayı olarak yazınız");
        int key=scan.nextInt();
        switch (key){
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar mevsimindesiniz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimindesiniz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar mevsimindesiniz");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Kıs mevsimindesiniz");
                break;
            default:
                System.out.println("lütfen ayınızı sayı olarak  giriniz");

        }















    }
}
