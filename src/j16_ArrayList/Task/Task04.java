package j16_ArrayList.Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> isim=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayan=new ArrayList<>();
        for (int i = 0; i <isim.size() ; i++) {
            if (!isim.get(i).toLowerCase().contains("a")){
                aOlmayan.add(isim.get(i));
            }
        }
        System.out.println("aOlmayan = " + aOlmayan);// bizden isim ismiyle istiyor listti
        isim.clear();// ismi boşalttık
        isim.addAll(aOlmayan);//isim listine a olmayanları attık
        System.out.println("isim = " + isim);// yazdırdık


    }
}
