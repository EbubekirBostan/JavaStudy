package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        // TASK 07
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        int n1=scan.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        int n2=scan.nextInt();
        System.out.print("Ucuncu Sayiyi Giriniz: ");
        int n3=scan.nextInt();
        System.out.println("En kucuk sayi: "+enkucuksayi(n1, n2, n3));
    }

    private static int enkucuksayi(int n1, int n2, int n3) {
        if (n1<n2 && n1<n3){
            return (n1);
        } else if (n2<n1 && n2<n3) {
            return (n2);
        }  else if (n3<n1 && n3<n2) {
            return (n3);
        }else System.out.println("Lütfen eşit sayılar girmeyiniz");
        return 0;
    }


}

