package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro


todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Kaç kişilik bilet istiyorsunuz sayı ile belirtin max 2 kişi olabilir");
        int kisisayisi=sc.nextInt();
        int FrankfurtKm=60;
        int KolnKm=80;
        int fislem=(60*5)/20;
        int kislem=(80*5)/20;
        int toplamTutar=0;
        switch (hedef){
            case "FRANKFURT":
                switch (kisisayisi){
                    case 1:
                        System.out.println("Rota = Frankfurt ");
                        System.out.println("Frankfurt 1 kişi = "+ (fislem) +" "+ "Euro");
                        toplamTutar+=15;
                        break;
                    case 2:
                        System.out.println("Rota = Frankfurt ");
                        System.out.println("Frankfurt 2 kişi = "+2* (fislem) +" "+ "Euro");
                        toplamTutar+=30;
                        break;
                }
                break;
            case "KÖLN":
                switch (kisisayisi){
                    case 1:
                        System.out.println("Rota = Köln ");
                        System.out.println("Köln 1 kişi = "+ (kislem) +" "+ "Euro");
                        toplamTutar+=20;
                        break;
                    case 2:
                        System.out.println("Rota = Köln ");
                        System.out.println("Köln 2 kişi = "+2* (kislem) +" "+ "Euro");
                        toplamTutar+=40;
                        break;
                }
                break;
        }
        System.out.print("Yatırmak istediğiniz miktarı giriniz :");
        double odenenmiktar = scan.nextDouble();
        double paraUstu = odenenmiktar-toplamTutar;
        if (odenenmiktar < toplamTutar) {
            System.out.println("Yetersiz ödeme ="+(toplamTutar-odenenmiktar)+ " Euro daha ödeme yapınız");
        } else {
            System.out.println("Para üstünüz : " + paraUstu + " Euro. İyi Yolculuklar");
    }
}}
