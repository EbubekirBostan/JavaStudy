package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
         /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç tane not girmek istiyorsunuz");
        int notSayisi=sc.nextInt();
        int notlar[]=new int[notSayisi];
        int tplm=0;
        int ortlmUstu=0;
        int ortlmAlti=0;
        for (int i = 0; i <notSayisi ; i++) {
            System.out.println(i+". Notu Giriniz: ");
            notlar[i]=sc.nextInt();
            tplm+=notlar[i];
        }
        System.out.println("tplm = " + tplm);
        int ortalama=tplm/notSayisi;
        for (int i = 0; i <=notlar.length-1 ; i++) {
            if (notlar[i]>=ortalama){
                ortlmUstu++;
            }else ortlmAlti++;
        }
        System.out.println("Dersi geçen öğrenci sayısı = " + ortlmUstu);
        System.out.println("Dersten kalan öğrenci sayısı = " + ortlmAlti);
    }
}
