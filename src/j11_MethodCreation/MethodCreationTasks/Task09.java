package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        //TASK 09
        Scanner scan=new Scanner(System.in);
        System.out.println("Çevirmek istediğiniz saati giriniz");
        double saat=scan.nextDouble();
        System.out.println(sniye(saat)+" Saniyedir");
    }

    private static double sniye(double saat) {
        double sny=(saat*60*60);
        return sny;
    }
}
