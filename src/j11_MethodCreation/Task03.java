package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Task>> Girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz

        Scanner scanner=new Scanner(System.in);
        System.out.print(" Sayi Giriniz : ");
        double a=scanner.nextDouble();
        System.out.println("İşlem Giriniz(+,-,*,/)");
        char islem=scanner.next().charAt(0);
        System.out.print(" Sayi Giriniz : ");
        double b=scanner.nextDouble();
        hesapla(a,b,islem);

    }

    private static void hesapla(double a, double b, char islem) {
        switch (islem){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("yanlış karakter girdiniz");
                break;
        }
    }
}
