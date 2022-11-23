package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("E-mail Adresinizi Giriniz: ");
        String mail=scan.next();
        emailGecerliMi(mail);
    }

    private static void emailGecerliMi(String mail) {

        if ((mail.indexOf('@')>0)&&(mail.endsWith(".com"))){
            System.out.println("Geçerli e mail adresi");
        }else System.out.println("Geçersiz e mail");
    }


}