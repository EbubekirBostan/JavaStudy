package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task>>>Girilen iki sayının eşitliğini kontrol eden method create ediniz.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int a=scanner.nextInt();
        System.out.print("Baska Sayi Giriniz : ");
        int b=scanner.nextInt();
        boolean esitlik =esitKontrol(a,b);
        System.out.println("esitlik = " + esitlik);
    }

    public static boolean esitKontrol(int a, int b) {
        boolean esitMi=false;
        if (a==b){
            esitMi=true;
        }else esitMi=false;

        return esitMi;
    }
}
