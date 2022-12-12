package lambdaCodeChallenge;
import j99_Lambda.C01_LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");
        ilkHarfDC(list);
        System.out.println("*********");
        yildizliString(list);
        System.out.println("*********");
        alfabetik(list);
        System.out.println("*********");
        lSil(list);
        System.out.println("*********");
        yeniListE(list);
        System.out.println("*********");
        ilkHarf3Kere(list);
        System.out.println("*********");
        ilkHarfByk(list);
        System.out.println("*********");
        uzunluk4Ve6(list);


    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim ***
    private static void ilkHarfDC(List<String> list) {
        list.stream().
                filter(t->t.toLowerCase().startsWith("c") || t.toLowerCase().startsWith("d")).forEach(C01_LambdaExpression::yazdirString);
    }
    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim ***
    public static void yildizliString(List<String> list){
        list.stream().map(t->"*"+t+"*").forEach(C01_LambdaExpression::yazdirString);
    }
    //S3: alfabetik  olarak siralayalim list olarak **
    public static void alfabetik(List<String> list){
        list.stream().map(t->t.toLowerCase()).sorted().forEach(C01_LambdaExpression::yazdirString);
    }
    //S4: tum 'l' leri silelim yazdiralim **
    public static void lSil(List<String> list){
        list.stream().map(t->t.toLowerCase().replaceAll("l","")).forEach(C01_LambdaExpression::yazdirString);
    }
    //S5 : icinde e olanlardan yeni bir list olusturunuz  **
    public  static void yeniListE(List<String> list){

        list.stream().filter(t->t.contains("e")).collect(Collectors.toList()).forEach(C01_LambdaExpression::yazdirString);
    }
    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public  static void ilkHarf3Kere(List<String> list){

        list.stream().map(t->t.substring(0,1).repeat(2)+t).forEach(C01_LambdaExpression::yazdirString);
    }
    //     **
    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public  static void ilkHarfByk(List<String> list){

        list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(C01_LambdaExpression::yazdirString);
    }
    //
    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    public  static void uzunluk4Ve6(List<String> list){
        list.stream().filter(t->t.length()!=4 && t.length()!=6).collect(Collectors.toList()).forEach(C01_LambdaExpression::yazdirString);
    }
    //
}