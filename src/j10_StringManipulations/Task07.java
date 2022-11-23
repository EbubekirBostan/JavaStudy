package j10_StringManipulations;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        girilen string içindeki istenen indexteki karakteri print eden code create ediniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("String Giriniz");
        String str=scan.nextLine();
        System.out.println("istediğin karakter için index gir");
        int ind=scan.nextInt();
        if (str.length()>ind){
            System.out.println(str.substring(ind,ind+1));
        }else System.out.println("Girdiğiniz metinde olmayan index istiyorsunuz");






    }
}
