package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        TASK -> girilen bir karakterin harf olup olmadığını kontrol eden code creat ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("bir karakter giriniz");
        char krktr=sc.nextLine().charAt(0);
        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')) {
            System.out.println("girdiğiniz karakter harfdir :)");
        }else System.out.println("girdiğiniz karakter harf değildir :(");













    }
}
