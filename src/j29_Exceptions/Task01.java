package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    /*
    Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pssw="";
        while (true) {
            try {
                System.out.println("password giriniz");
                pssw= sc.next();
                if (pssw.length()<6 ){
                    throw new IllegalArgumentException();
                }else if (pssw.length()>10){
                    throw new IllegalArgumentException();
                }else  break;
            }catch(IllegalArgumentException e){
                System.out.println("canım lütfen 6 dan büyük ve 10 dan küçük karakter sayısı gir");
            }
        }

    }
}
