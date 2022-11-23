package j11_MethodCreation.MethodCreationTasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        // TASK 08
        Scanner scan=new Scanner(System.in);
        System.out.print("Öğrenmek İstediğiniz Yılı Giriniz: ");
        int year=scan.nextInt();
        System.out.println(artikYil(year));

    }

    private static boolean artikYil(int year) {
        if (year%4==0){
            return true;
        } else if (year%100==0 && year%400==00) {
            return true;
        }else
        return false;
    }
}
