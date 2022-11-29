package j99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {
                /*
        TASK :
        fields --> Universite (String)
                   bolum (String)
                   ogrcSayisi (int)
                   notOrt (int)
                   olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.*/
     public static void main(String[] args) {
         Universite u01=new Universite("Bogazici","Matematik",571,73);
         Universite u02=new Universite("Istanbul","Matematik",622,77);
         Universite u03=new Universite("Marmara","Hukuk",1453,52);
         Universite u04=new Universite("Itu","Uçak Muh.",333,63);
         Universite u05=new Universite("Yıldız Teknik","Gemi",216,55);
         List<Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
         System.out.println("Task01 : "+notOrt74Byk(unv));
         System.out.println("******");
         System.out.println("Task02 : " + ogrSayi110denAz(unv));
         System.out.println("******");
         System.out.println("Task03 : " + enAzBirMatVarMi(unv));
         System.out.println("******");
         System.out.println("Task04 : " + ogrSayiTerSira(unv));
         System.out.println("******");
         System.out.println("Task05 : " + notOrtTerSira(unv));
         System.out.println("******");
         System.out.println("Task06 : " + enAzOgrSayisi2Uni(unv));
         System.out.println("******");
         System.out.println("Task07 : " + notOrt63BykOgrcStsTplm(unv));
         System.out.println("******");
         System.out.println("Task08 : " + ogrSys333BykNotOrtTpl(unv));

     }
     //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public  static boolean notOrt74Byk(List<Universite> unv){
         return unv.stream().allMatch(t->t.getNotOrt()>74);
    }
    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean ogrSayi110denAz(List<Universite> unv){
         return unv.stream().allMatch(t->t.getOgrcSayisi()>=110);
    }
    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean enAzBirMatVarMi(List<Universite> unv){
        return unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains("matematik"));
    }
    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> ogrSayiTerSira(List<Universite> unv){
        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                 collect(Collectors.toList());//akışdaki elemanlar liste atandı
        // collect(Collectors.coll)->Collector class'dan call edilen coll. meth ile akış elemanları atanır


    }
    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static List<Universite> notOrtTerSira(List<Universite> unv){
        return unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).
                collect(Collectors.toList());

    }
    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static List<Universite> enAzOgrSayisi2Uni(List<Universite> unv){
        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).
                collect(Collectors.toList());

    }
    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static int notOrt63BykOgrcStsTplm(List<Universite> unv){
         return unv.stream().filter(t->t.getNotOrt()>63).
                 mapToInt(t->t.getOgrcSayisi()).//akıştaki elemanların data type'ını parametrede ki değere göre update eder
                 sum();
    }
    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static double ogrSys333BykNotOrtTpl(List<Universite> unv){
        return unv.stream().filter(t->t.getOgrcSayisi()>333).
                mapToDouble(t->t.getNotOrt()).
                        average().getAsDouble();//getaasdouble sız oldugunda return type Optional Double olur
    }
    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
//task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

}
