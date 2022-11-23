package Day05;

import java.util.Scanner;

public class Q4_MethodCreation {
/*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Cevirmek istediginiz cm'yi giriniz");
        double cm=scan.nextInt();
        System.out.println(metre(cm)+" metredir");
        System.out.println(kmetre(cm)+" kilometredir");


    }

    public static double kmetre(double cm) {

        return cm/100000;
    }

    public static double metre(double cm) {
        return cm/100;
    }
}