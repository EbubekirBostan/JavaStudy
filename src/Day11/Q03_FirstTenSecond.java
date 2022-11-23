package Day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        //Local time ile her dakikanın ilk 10 saniyesi
        LocalDateTime zaman=LocalDateTime.now();
        System.out.println("zaman = " + zaman);
        DateTimeFormatter simdi=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        if (zaman.getSecond()<10){
            System.out.println("Evet = " + simdi.format(zaman));
        }else System.out.println("Hayır = " + zaman.format(simdi));
    }
}
