package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //Task-> girilen bir ifadedeki c karakterine kadar a sayısını print eden code yazınız
        Scanner sc=new Scanner(System.in);
        System.out.println("String Giriniz : ");
        String str=sc.nextLine();
        int aSayisi=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch=='a'){
                aSayisi++;
            } else if (ch=='c') {
                break;
            }
            System.out.println("döngüde işleme giren string :"+ch);

        }
        System.out.println("Toplam a:"+aSayisi);









    }
}
