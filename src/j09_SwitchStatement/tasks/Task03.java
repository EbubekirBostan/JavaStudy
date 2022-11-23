package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
         gunNo%=7;
        switch (gunNo){
            case 1:
                System.out.println(" Gun= Pazartesi" );
                break;
            case 2:
                System.out.println(" Gun= Salı");
                break;
            case 3:
                System.out.println(" Gun= Çarşamba");
                break;
            case 4:
                System.out.println(" Gun= Perşembe");
                break;
            case 5:
                System.out.println(" Gun= Cuma");
                break;
            case 6:
                System.out.println(" Gun= Cumartesi");
                break;
            case 0:
                System.out.println(" Gun=  Pazar");
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz, Yapmayiniz");
                break;
        }








    }
}
