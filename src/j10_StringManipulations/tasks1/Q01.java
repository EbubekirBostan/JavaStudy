package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Cümle Yaziniz");
        String cumle=scan.nextLine();
        String bosluk=" ";
        if (cumle.contains(bosluk)){
            System.out.println("cumle = "+ "boşluk içeriyor");
        }else System.out.println("cumle = "+ "boşluk içermiyor");


    }
}

