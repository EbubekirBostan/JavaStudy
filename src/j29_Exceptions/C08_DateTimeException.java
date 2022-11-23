package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException
       // LocalDate date=LocalDate.of(2022,11,33);//DateTimeException

        try {
            LocalDate date=LocalDate.of(2022,11,30);
            System.out.println("canım canım komut sorunsuz :)");
        }catch(DateTimeException e){
            System.out.println("agam hata aldın ben yaptım işin iş : "+e.getMessage());
        }
        System.out.println("agam handle ettim her zaman olmaz");
    }
}
