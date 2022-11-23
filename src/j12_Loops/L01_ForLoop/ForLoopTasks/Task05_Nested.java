package j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz
         */
        for (int apt = 1; apt <= 6; apt++) {//dış döngü

            for (int daire = 1; daire < 6; daire++) {
                System.out.print("# ");
            }
            System.out.println();//dumy->hayalet komut:işlevi olmayan satır atlatan komut
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç satır ve sütunlu şekil istiyorsunuz");
        int secim= sc.nextInt();

        for (int i = 0; i <secim ; i++) {
            for (int j = 0; j <secim-1 ; j++) {
                System.out.print(" # ");
            }
            System.out.println();

        }


    }
}
