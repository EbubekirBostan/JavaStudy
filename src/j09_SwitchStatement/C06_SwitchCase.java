package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //TASK>>>> Girilen Haftanın Gününü Hafta içi veya sonu olduğunu code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Haftanın Gününü Giriniz");
        String gun=scan.next().toLowerCase();
        switch (gun){
            case "pazartesi":
            case "salı":
            case "çarsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("yanlış giriş yaptınız");
        }



























    }
}
