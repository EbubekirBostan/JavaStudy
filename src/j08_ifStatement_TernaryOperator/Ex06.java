package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        TASK -> kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000 den fazla ise emekliliğini
        kullanıcının cinsiyeti erkek ise 65 yaşından büyük ve prim günü 7000 den fazla ise emekliliğini kontrol edip
        kalan yıl ve prim günün print eden  code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Cinsiyetiniz girin \n Kadın için K \n Erkek için E\n giriniz : ");
        char cins=sc.next().charAt(0);
        System.out.println("yaşınızı giriniz");
        int yas=sc.nextInt();
        if (cins=='K'){// cinsiyetin kadın olması kontrol edildi
            if (yas>60){//yaş kontrol
                System.out.println("prim gününüzü giriniz");
                int prim=sc.nextInt();
                if (prim>6000){// prim kontrol edildi
                    System.out.println(" Tebrikler Emekli Oldunuz :) ");
                }else System.out.println("emekliliğiniz için: "+ (6000-prim) + "yatırmanız lazım");
            }else System.out.println("emekliliğinize daha : "+ (60-yas) + "yıl daha var");

        } else if (cins=='E') {// cinsiyet kontrol
            if (yas>65){//yaş kontrol
                System.out.println("prim gününüzü giriniz");
                int prim=sc.nextInt();
                if (prim>7000){// prim kontrol edildi
                    System.out.println(" Tebrikler Emekli Oldunuz :) ");
                }else System.out.println("emekliliğiniz için: "+ (7000-prim) + "yatırmanız lazım");
            }else System.out.println("emekliliğinize daha : "+ (65-yas) + "yıl daha var");

        }else System.out.println("cinsiyetinizi dogru giriniz");


    }
}
