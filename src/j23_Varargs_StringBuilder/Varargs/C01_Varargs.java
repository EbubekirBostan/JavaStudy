package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }
	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */
        // Task -> verilen iki toplamını print eden METHOD create ediniz
        int sayi1=33;
        int sayi2=35;
        int sayi3=7;
        int sayi4=27;
        topla(sayi1,sayi2);
        topla(sayi3,sayi4);
        System.out.println("******varargs*****");
        toplaVarargs(5,sayi1,sayi2,sayi3);
        toplaVarargs(sayi1,sayi2,sayi3,sayi4);
        // TASK-> VERİLEN sTRİNG'LERİN EN FAZLA KARAKTERE SAHİP OLANI PRİNT EDEN METHOD CREATE EDİNİZ..
        enUzunKelime("aga","bekir","haluk");



    }
    public static void enUzunKelime(String... str){
        String enUzun="";
        for (String w:str){
            if (w.length()>enUzun.length()){
                enUzun=w;
            }
        }
        System.out.println("enUzun = " + enUzun);
    }
    public static void topla(int a, int b){
        System.out.println("sayılar toplamı: "+(a+b));
    }
    public static void toplaVarargs(int...a){
        int toplam=0;
        for (int w: a){//varargs parametre arr içinde tanımlandığı için parametreler loop ile işlem yapılır
            toplam+=w;
        }
        System.out.println("sayıların toplamı: "+(toplam));
    }
}
