package j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz : ");
        int num=sc.nextInt();
        System.out.print("Asal mi : "+getAsalMi(num));

    }

    private static boolean getAsalMi(int num) {
        boolean asal=true;
        for (int i=2; i<num; i++) {
            if (num%i==0){
                asal=false;
            }
        }
        return asal;
    }
}
