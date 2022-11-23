package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException01 {
    public static void main(String[] args){
        /*
        ahan da TRİCK köşesinde Bugün

        "throw" - "throws" farkları
        1-"throws" -> main method kapanış parantezi ile method body açılış parantezi arasına yazılır
          "throw"  -> method body içinde tanımlanır
          2-"throws" ->keywordden sonra birden fazla exception tanımlanabilir
          "throw" ->keywordden sonra sadece bir tane exception tanımlanır
          3- "throws" ->keywordden sonra sadece exception class name yazılır
          "throw" -> keywordden sonra exception obj tanımlanır
          4- "throws" ->keyword method ilk satırda sadece bir kez tanımlanır
          "throw" -> keyword istenildiği kadar method body de tanımlanabilir

         */
        /*IllegalArgumentException -> kullanılmasını istemeyen değerlerde programın hata vermemesi isteniyorsa
        bu excp fırlatır
        örnek : yas datası için negatif değer girildiğinde programın kırılmadan run olması ama girilen değer için
        excep. fırlatması için kullanılır
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("agam yasını giresen : ");

        int age= sc.nextInt();
        // if (age<18){
        //     System.out.println("yasınız : "+age+" ehliyet için uygun değil ");
        //     throw new IllegalArgumentException();//throw komutu try-catch block olmadan da istenen method body'de tanımlanabilir.
        // }
        // else System.out.println("yasınız : "+age+" ehliyet için uygun");

        try {
            if (age<0){
                throw new IllegalArgumentException();// throw keyword ile Excp obj oluşturularak hata tanımlanır
                //ve fırlatılır böylece şartımıza uymayan değer için de catch block'a düşürerek daha pratik kod yazıldı
            }else System.out.println("agam yaşın hayırlı olsun " + age);
            System.out.println("canım canım komut sorunsuz :)");

        }catch (IllegalArgumentException e){
            System.out.println("agam niddin milattan önce mi kaldın adam gibi yaş gir");
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        System.out.println("agam handle ettim her zaman olmaz");
    }
}
