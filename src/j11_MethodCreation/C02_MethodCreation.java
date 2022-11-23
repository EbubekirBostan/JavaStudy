package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //task>>> girilen 3 notun ortalamasını hesaplayan method create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.print("Not 1 Giriniz: ");
        double not1=scan.nextDouble();
        System.out.print("Not 2 Giriniz: ");
        double not2=scan.nextDouble();
        System.out.print("Not 3 Giriniz: ");
        double not3=scan.nextDouble();
        double ortalama=ortalamahesapla(not1,not2,not3);
        System.out.println("ortalamanız = " + ortalama);

    }//main sonu

    public static double ortalamahesapla(double a, double b, double c) {

        return (a+b+c)/3;
    }


}
