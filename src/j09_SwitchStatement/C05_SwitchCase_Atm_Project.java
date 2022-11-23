package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_Atm_Project {
    public static void main(String[] args) {
        /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        System.out.println("bakiye öğrenmek için 1'i \n para yatırma için 2 yi\n çekme için 3ü\n çıkış için 4 ü tuşlayınız\n Giriş");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                System.out.println("bakiye = " + bakiye);
                break;
            case 2:
                System.out.println("Yatıracağınız miktarı giriniz");
                int yat=scan.nextInt();
                bakiye+=yat;
                System.out.println("Son bakiye = " + (bakiye));
                break;
            case 3:
                System.out.println("Cekeceginiz miktarı giriniz");
                int cek=scan.nextInt();
                if (cek>bakiye){
                    System.out.println("bakiyeden fazla para çekemezsin");
                    System.out.println("bakiyeniz = " + bakiye);
                }else {
                    bakiye-=cek;
                    System.out.println("Son bakiye = " + (bakiye));
                }
                break;
            case 4:
                System.out.println("Tekrar görüşmek üzere");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }
    }
}
