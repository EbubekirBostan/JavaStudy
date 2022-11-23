package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        if (sayi<-9 || sayi>9){
        switch ((sayi/10)%10){
            case 0:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"SIFIR\" ");
                break;
            case 1:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"BIR\" ");
                break;
            case 2:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"IKI\" ");
                break;
            case 3:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"UC\" ");
                break;
            case 4:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"DORT\" ");
                break;
            case 5:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"BES\" ");
                break;
            case 6:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"ALTI\" ");
                break;
            case 7:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"YEDI\" ");
                break;
            case 8:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"SEKIZ\" ");
                break;
            case 9:
                System.out.println("Girdiğiniz sayinin onlar basamagi \"DOKUZ\" ");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                break;
        }}else System.out.println("Lütfen Iki basamakli sayi giriniz");




    }
}
