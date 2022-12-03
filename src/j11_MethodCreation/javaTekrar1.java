package j11_MethodCreation;

import java.util.Scanner;

public class javaTekrar1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int x=sc.nextInt();
        System.out.println("Bir sayı giriniz: ");
        int y=sc.nextInt();
        javaTekrar2 meth=new javaTekrar2();
        meth.esitMi(x, y);

    }
}
