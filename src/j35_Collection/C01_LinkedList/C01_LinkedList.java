package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList....
        1- LinkedList'de elemanlar "data" ve "adres" ve olmak üzere iki kısımdan oluşur ve eleman yerine "node"
        olarak tanımlanır
        2- LinkedList'de ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır
        3-LinkedList'de son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır.
        LinkedList eleman bulmada index yapısı olmadığı için daha yavaştır
        5- LinkedList -> tren vagon ilişkisi bağlantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı iterface(List,Queue...)
        olmamasına dikkat edilmeli Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent  interface'den(List,Queue) implement edilmiştir
         */
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Adem","İlker","Merve"));//LinkedList
        //hem declare+assaigment
        //LinkedList print..
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Adem, İlker, Merve]
        //LinkedList add..
        ll1.add("Uğur");
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Adem, İlker, Merve, Uğur]
        ll1.add(2,"Abdullaziz");
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Abdullaziz, Adem, İlker, Merve, Uğur]
        ll1.addFirst("JavaCAN");
        System.out.println("ll1 = " + ll1);//ll1 = [JavaCAN, Ebubekir, Gülsüm, Abdullaziz, Adem, İlker, Merve, Uğur]
        ll1.addLast("javaTAR");
        System.out.println("ll1 = " + ll1);//ll1 = [JavaCAN, Ebubekir, Gülsüm, Abdullaziz, Adem, İlker, Merve, Uğur, javaTAR]
        List<String> ll2=new LinkedList<>(Arrays.asList("Fatih","Erol","Nur"));//DataType interface List olan LinkedList
        ll1.addAll(ll2);
        //ll1.addAll("Agam");//addALL Collection çalışır CTE verir parametre Collection olmazsa
        System.out.println("ll1 = " + ll1);//ll1 = [JavaCAN, Ebubekir, Gülsüm, Abdullaziz, Adem, İlker, Merve, Uğur, javaTAR, Fatih, Erol, Nur]
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);//ll1 = [JavaCAN, Ebubekir, Gülsüm, Fatih, Erol, Nur, Abdullaziz, Adem, İlker, Merve, Uğur, javaTAR, Fatih, Erol, Nur]

    }
}
