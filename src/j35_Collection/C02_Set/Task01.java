package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
        Değer ataması yapılan Arrayi arrayliste çeviren method create ediniz
         main içerisinde meth return ettiği arrylisti hasset, linkedHashset ve TreSette atayınız
         */
        String arr[]={"Muharrem","Umit","Sinan","Nihan"};

        HashSet<String> hs=new HashSet<>( arrayListeCevir(arr));
        LinkedHashSet<String> lhs=new LinkedHashSet<>( arrayListeCevir(arr));
        TreeSet<String> ts=new TreeSet<>(arrayListeCevir(arr));
        System.out.println("hs = " + hs);//hs = [Muharrem, Sinan, Nihan, Umit]
        System.out.println("lhs = " + lhs);//lhs = [Muharrem, Umit, Sinan, Nihan]
        System.out.println("ts = " + ts);//ts = [Muharrem, Nihan, Sinan, Umit]


    }

    private static List<String>  arrayListeCevir(String[] arr) {
        List<String> arrlist=new ArrayList<>(List.of(arr));
      //  for (String w:arr){
      //      arrlist.add(w);
      //  }

        return arrlist;
    }

}
