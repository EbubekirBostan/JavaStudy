package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        //Task -> String data type bir pin datasının 3 giriş hakkını kontrol eden code create ediniz
        Scanner sc=new Scanner(System.in);
        String dPin="javaCAN";
        int girisHakki=3;
        while (true){
            System.out.println("Pin Giriniz : ");
            String pin=sc.nextLine();
            if (pin.equals(dPin)){
                System.out.println("Giriş Başarılı");
                break;
            }else {
                System.out.println("Giriş Başarısız");
                girisHakki--;
                System.out.println("agam kalan canın : "+ girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Giriş hakkınız Bitti");
                break;
            }
        }





    }
}
