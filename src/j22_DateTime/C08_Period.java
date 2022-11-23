package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period -> iki tarih arasında geçen tekrarlanabilen zamanı tutar.
        LocalDate bugun=LocalDate.now();
        LocalDate bekBirthDay=LocalDate.of(1986,6,16);
        Period fark=Period.between(bekBirthDay,bugun);
        System.out.println("fark = " + fark);//fark = P36Y4M10D
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark.toTotalMonths() = 436
        System.out.println("fark.getDays() = " + fark.getDays());//fark.getDays() = 10
        System.out.println("********");
        System.out.println("bugun = " + bugun);
        Period period5Gun=Period.ofDays(5);//5 günde bir tekrarlayan period
        Period period7Ay=Period.ofMonths(7);// 7 ayda bir tekrarlanan period
        Period periodX=Period.ofMonths(7).ofDays(21);// TRİCK** Periodda çoklu tanımlamada son girilen parametre çalışır

        bugun=bugun.plus(period5Gun);// bugüne 5 günlük bir period eklendi
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7Ay);//bugüne 7 aylık period geri gidildi
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);
        // task 5.9.2022 de başlayan kur 9 ay olduguna göre bitiş tarihini print eden code create ediniz.

        LocalDate baslangic=LocalDate.of(2022,9,5);
        Period bitis=Period.ofMonths(9);
        System.out.println("baslangic.plus(bitis) = " + baslangic.plus(bitis));

        System.out.println("baslangic.plus(bitis).format(DateTimeFormatter.ISO_DATE) = " + baslangic.plus(bitis).format(DateTimeFormatter.ISO_DATE));


    }
}
