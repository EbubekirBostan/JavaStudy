package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10_NestedForLoop {
    public static void main(String[] args) {
        /*
        Girilen bir ifadenin istenen harf sayısını print eden code create ediniz
        input: selam javaCAN'lar
        output: a sayısı:3
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Cümle giriniz");
        String cumle=sc.nextLine();
        System.out.println("Sayılacak harfi giriniz");
        char harf=sc.next().charAt(0);

        int harfSayisi=0;// ilk değer 0 atandı ki sayma da etki etmesin
        for (int i=0; i<=cumle.length()-1; i++){
            if (cumle.charAt(i)==harf){
                harfSayisi++;
            }
        }
        System.out.println("girdiğiniz cumle : "+cumle+" de istediğinz harf: "+harf+" "+harfSayisi+" tane var");




    }
}
