package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder obj create etme
        //1. yol
        StringBuilder sb1=new StringBuilder();//defaul capacity 16bit olan value olmayan boş builder
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("JAVATAR");
        System.out.println("sb1 = " + sb1);//sb1 = JAVATAR
        sb1.append(" selam ").append(" olsun ").append(33).append(" ").append(true);
        System.out.println("sb1 = " + sb1);//sb1 = JAVATAR selam  olsun 33 true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34

        sb1.append("başarı gayrete aşıktır :) ");
        System.out.println("sb1.capacity() = " + sb1.capacity());//70
        System.out.println("sb1.length() = " + sb1.length());//54
        sb1.trimToSize();//54
        System.out.println("sb1.capacity() = " + sb1.capacity());//54
        //2.yol
        StringBuilder sb2=new StringBuilder("Kevser hanıma Selamlar");//ilk değer ataması yapılmış sb1 stbuil
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());//22
        System.out.println("sb2.capacity() = " + sb2.capacity());//38
        sb2.append("bjkdfhjkdjhfkljdklfjkkldjkfjasfdasfasfasfasfsfd");
        System.out.println("sb2.capacity() = " + sb2.capacity());//78 2n+2 ile
        // trimToSize()-> fazladan ayrılan capacity silinir
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());
        //3.yol
        StringBuilder sb3=new StringBuilder(11);//hafızada 11 karakterlik yer ayıran bos sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());// bos sb3 karakter sayısı=0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24

        //istenen bir karakter index'i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m
        //istenen bir aralıktaki karakterleri alma
        System.out.println("sb2.subSequence(1,8) = " + sb2.subSequence(1, 8));//1.2.3...7karakterleri verir  evser h
        System.out.println("sb2.substring(17) = " + sb2.substring(17));//17 ve tüm karakterler
        System.out.println("sb3.substring(1,15) = " + sb3.substring(1,5));//bube
        //belirli bir indexteki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//3. index A silindi JAVTAR selam  olsun 33 truebaşarı gayrete aşıktır :)
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3.4.5.6 index silinir JAVselam  olsun 33 truebaşarı gayrete aşıktır :)
        // istenen karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));// ebub:)ekir bey
        System.out.println("sb3.length() = " + sb3.length());
        String s="güzel insan";
        //System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));

        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//sb3 datasının
        //1. indexine s datasının [3,7) indexi ekle ve sb3 ü yazmaya devam et sb3.insert(1,s,3,7) = eel ibub:)ekir bey
        StringBuilder sb4=new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));
        System.out.println("sb4.insert(5,\" \") = " + sb4.insert(5, " "));
        // istenen indexteki karakteri değiştirme..
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);//sb4 = NihanQA Hanım
        System.out.println("sb4.insert(5,\" \") = " + sb4.insert(5, " "));
        // istenen index'e karakter yerine birden çok karakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));
        // Sb obj Stringe çevirme-> toString()
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());// EEL İBUB:)EKİR BEY
        // sb3 stringe çevrilerek toUpperCase() method çalışıldı


        //String ile StringBuilder karsilastirmasi
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */

        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0 yani true
        //sb6.compareTo(str1)//cte verir elma armut kıyaslanmaaazzzz..
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));// false
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true


    }
}
