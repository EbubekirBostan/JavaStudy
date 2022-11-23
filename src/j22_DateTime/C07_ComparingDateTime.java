package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate falanGun=bugun.minusDays(24);
        LocalDate fesmekanGun=bugun.plusDays(3);
        LocalDate bekBirthDay=LocalDate.of(1986,06,16);
        System.out.println("bugun = " + bugun);
        System.out.println("falanGun = " + falanGun);
        System.out.println("fesmekanGun = " + fesmekanGun);

        System.out.println("bugun.isBefore(falanGun) = " + bugun.isBefore(falanGun));
        System.out.println("bugun.isBefore(fesmekanGun) = " + bugun.isBefore(fesmekanGun));
        System.out.println("falanGun.isBefore(fesmekanGun) = " + falanGun.isBefore(fesmekanGun));

        System.out.println("bugun.isAfter(falanGun) = " + bugun.isAfter(falanGun));
        System.out.println("falanGun.isAfter(fesmekanGun) = " + falanGun.isAfter(fesmekanGun));

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());

        int fark=bugun.compareTo(falanGun);
        System.out.println("fark = " + fark);
        int fark1=fesmekanGun.compareTo(falanGun);
        System.out.println("fark1 = " + fark1);
        System.out.println("bugun.compareTo(bekBirthDay) = " + bugun.compareTo(bekBirthDay));
        /*
         ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için
         */


    }
}
