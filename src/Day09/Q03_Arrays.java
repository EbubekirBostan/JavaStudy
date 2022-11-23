package Day09;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Cümle Yazınız = ");
        String cumle=sc.nextLine();
        String [] cumleArr=cumle.split(" ");
        System.out.println("Kelime Sayisi = " + cumleArr.length);
    }
}
