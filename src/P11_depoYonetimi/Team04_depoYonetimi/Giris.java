package P11_depoYonetimi.Team04_depoYonetimi;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Giris {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    String glnyuz = "\uD83D\uDE00";
    String uzgn = "\uD83D\uDE0C";
    String krpz="\uD83C\uDF49";
    String uzm="\uD83C\uDF47";
    String clk="\uD83C\uDF52\uD83C\uDF53";
    public void girisPaneli() {
        System.out.println(G + "======="+clk+uzm+krpz+ glnyuz +"MANAV DEPOMUZA HOŞGELDİNİZ"+ glnyuz +krpz+uzm+clk+ "======\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " +R);
        System.out.print("Lütfen yapmak istediginiz islemi seçiniz  : ");
        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:
                    Methods.urunTanimlama();
                    girisPaneli();
                    break;
                case 2:
                    Methods.urunListele();
                    girisPaneli();
                    break;
                case 3:
                    Methods.urunGirisi();
                    girisPaneli();
                    break;
                case 4:
                    Methods.urunuRafaKoy();
                    girisPaneli();
                    break;
                case 5:
                    Methods.urunCikisi();
                    girisPaneli();
                    break;
                case 6:
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Hatalı Giriş Yaptınız..."+uzgn);
            scan.nextLine();
            girisPaneli();
        }
    }
}
