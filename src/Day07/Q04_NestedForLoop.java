package Day07;

public class Q04_NestedForLoop {
    public static void main(String[] args) {
/*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
*/
        for (int satir = 1; satir <=5 ; satir++) {
            for (int bosluk = 5-satir; bosluk >0 ; bosluk--) {
                System.out.print(" ");
            }
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("***Sola Dayalı***");
        for (int satir = 1; satir <=5 ; satir++) {
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
