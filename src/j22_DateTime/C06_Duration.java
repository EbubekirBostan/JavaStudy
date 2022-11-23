package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece=LocalTime.of(0,17);
        LocalTime ogle=LocalTime.of(13,33);

        Duration fark=Duration.between(gece,ogle);// öglen zamanı ile gece zamanı arasındki zaman farkı atandı
        System.out.println("fark = " + fark);
        System.out.println("fark.getSeconds() = " + fark.getSeconds());
        System.out.println("fark.getNano() = " + fark.getNano());
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());
        System.out.println("fark.toMillis() = " + fark.toMillis());
        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());

    }
}
