package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("oldugunuz ayı sayı olarak yazınız");
        int key=scan.nextInt();
        switch (key){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen ay 31 gün içerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 gün içerir");
                break;
            case 2:
                System.out.println("yilinizi giriniz");
                int yil= scan.nextInt();
                if (yil%4==0) {
                    System.out.println("Girilen ay 29 gün içerir");
                }else System.out.println("Girilen ay 28 gün içerir");
                break;
            default:
                System.out.println("adam gibi birşey gir");
        }










    }
}
