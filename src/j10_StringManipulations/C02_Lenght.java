package j10_StringManipulations;

public class C02_Lenght {
    public static void main(String[] args) {
        /*
        lenght() metodu girilen stringin uzunluğunu içinde bulunan karakter sayısını return eder.
        bütün karakterleri(boşluk vs) sayıp adedini verir.
         */
        String str="madem geldin dünyaya otur çalış javaya";
        str.length();//int type bir data verir.
        int strKrktrSayisi=str.length();
        System.out.println("str = " + str);
        System.out.println("strKrktrSayisi = " + strKrktrSayisi);//38
        String str1="";
        System.out.println(str1.length());//0
        String str2=" ";
        System.out.println(str2.length());//1

        String str3=null;
        System.out.println(str3.length());//Run time error verir
        //TRİCK>>>null atanan stringler String method çalışmaz
        /*
        Trickk>>> null case sensitivedir. yani null veya NULL yazılamaz
        null bir değer değildir. sadece hiçliği gösteren pointer(giriş işaretçi)dır
         */


    }
}
