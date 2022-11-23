package j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Task06_Nested {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

        for (int crpn1 = 1; crpn1 <=10 ; crpn1++) {
            for (int crpn2 = 1; crpn2<=10;crpn2++){


                System.out.println(crpn1+" x "+crpn2+" = "+(crpn1*crpn2));
            }
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("ÇArpım tablosunu görmek istediğiniz sayıyı girin");
        int secim= sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            for (int j = secim; j <=secim ; j++) {
                System.out.print((j)+" x "+(i)+ " = "+(i*j));
            }
            System.out.println();
        }


    }
}
