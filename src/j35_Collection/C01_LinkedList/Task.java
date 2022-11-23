package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
       Task->
        Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bşe linkedLst create ediniz.
        Girilen bir String değeri linkedListte varlığını kmontrol edip varss slilp "Agam elelman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi
         */

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Teykinay"));
        Scanner sc=new Scanner(System.in);
        System.out.println("Agam kime bakmıştınız : ");
        String aganinAdami=sc.next();
        if (ll1.remove(aganinAdami)){// true istenen eleman var ve silindi
            System.out.println("Agam elelman halledildi");
            System.out.println("ll1 = " + ll1);
        }else System.out.println("Agam aradığınız kişiye ulaşılamadı");
    }
}
