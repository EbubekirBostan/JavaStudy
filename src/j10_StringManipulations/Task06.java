package j10_StringManipulations;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        Girilen Stringin son karakterini silen code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("String Giriniz");
        String str=scan.next();
        System.out.println(str.substring(0, str.length() - 1));


    }
}
