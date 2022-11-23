package Day11;

import java.time.LocalDate;

public class Q01_LocalDate {
    public static void main(String[] args) {
        // Bugunun tarihi aliniz, yazdiriniz...
// Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
// Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..
        LocalDate bugun=LocalDate.now();
        System.out.println("bugun = " + bugun);
        LocalDate degisim=bugun.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println("degisim = " + degisim);
        LocalDate degisim2=degisim.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println("degisim2 = " + degisim2);
    }
}
