package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*
        Task -> Girilen bir sayi ile girilen Stringlerin en uzun harf sayısını çarpıp print eden method create ediniz
         */
        int sayi=5;
        String str1="Java";
        String str2="Cavala";
        String str3="Bakalaka";
        strCarp(5,str1,str2,str3);


    }
    public static void strCarp(int a,String... b){
        String enUzun="";
        for (String w:b){
            enUzun=w.length()>enUzun.length() ? w : enUzun;
        }
        System.out.println("Sonuç : "+ (a*enUzun.length())+ " " +enUzun);
    }
}
